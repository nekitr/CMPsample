package com.s1mple_dev.cmpsample.sample.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.s1mple_dev.cmpsample.app.NavigationCommand
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

abstract class BaseViewModel<S, E : BaseViewEvent>(startingState: S) : ViewModel() {
    protected open val ioDispatcher: CoroutineDispatcher = Dispatchers.IO

    private val _intents = MutableSharedFlow<Intent<S>>(
        extraBufferCapacity = Int.MAX_VALUE,
        onBufferOverflow = BufferOverflow.DROP_OLDEST,
        replay = 0
    )

    private val _state = MutableStateFlow(startingState)
    val state: StateFlow<S>
        get() = _state.asStateFlow()

    init {
        _intents.distinctUntilChanged()
            .onEach { intent -> _state.update { intent.reduce(state.value) } }
            .launchIn(viewModelScope)
    }

    protected fun publish(block: S.() -> S): Boolean = _intents.tryEmit(intent(block))
    protected fun publish(intent: Intent<S>): Boolean = _intents.tryEmit(intent)

    fun process(event: E) = publish(event.toIntent())

    abstract fun E.toIntent(): Intent<S>

    protected fun <X> followDistinctChanges(map: suspend (S) -> X, action: (X) -> Unit): Job =
        viewModelScope.launch(ioDispatcher) {
            state
                .map(map)
                .distinctUntilChanged()
                .collect { action(it) }
        }

    private val _navigationCommand = MutableSharedFlow<NavigationCommand>()
    val navigationCommand = _navigationCommand.asSharedFlow()

    fun navigateTo(command: NavigationCommand) {
        viewModelScope.launch(ioDispatcher) {
            _navigationCommand.emit(command)
        }
    }
}