package com.s1mple_dev.cmpsample.sample.presentation.second

import com.s1mple_dev.cmpsample.app.NavigationCommand
import com.s1mple_dev.cmpsample.sample.presentation.base.BaseViewEvent

sealed interface SecondEvent : BaseViewEvent {
    data class NavigateTo(val command: NavigationCommand) : SecondEvent
}