package com.s1mple_dev.cmpsample.sample.presentation.first

import com.s1mple_dev.cmpsample.sample.presentation.base.BaseViewModel
import com.s1mple_dev.cmpsample.sample.presentation.base.Intent
import com.s1mple_dev.cmpsample.sample.presentation.base.sideEffect

class FirstScreenViewModel() : BaseViewModel<FirstState, FirstEvent>(FirstState()) {

    override fun FirstEvent.toIntent(): Intent<FirstState> {
        return when (val event = this) {
            is FirstEvent.NavigateTo -> sideEffect { navigateTo(command = event.command) }
            is FirstEvent.OnFavouriteClick -> TODO()
            is FirstEvent.OnRecentClick -> TODO()
            is FirstEvent.SearchQuery -> TODO()
        }
    }
}