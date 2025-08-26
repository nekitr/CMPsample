package com.s1mple_dev.cmpsample.sample.presentation.second

import com.s1mple_dev.cmpsample.sample.presentation.base.BaseViewModel
import com.s1mple_dev.cmpsample.sample.presentation.base.Intent
import com.s1mple_dev.cmpsample.sample.presentation.base.sideEffect

class SecondScreenViewModel() : BaseViewModel<SecondState, SecondEvent>(SecondState()) {

    override fun SecondEvent.toIntent(): Intent<SecondState> {
        return when (val event = this) {
            is SecondEvent.NavigateTo -> sideEffect { navigateTo(command = event.command) }
        }
    }
}