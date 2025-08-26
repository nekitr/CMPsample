package com.s1mple_dev.cmpsample.sample.presentation.first

import com.s1mple_dev.cmpsample.app.NavigationCommand
import com.s1mple_dev.cmpsample.sample.presentation.base.BaseViewEvent

sealed interface FirstEvent : BaseViewEvent {
    data class NavigateTo(val command: NavigationCommand) : FirstEvent
    data class SearchQuery(val query: String) : FirstEvent
    data object OnFavouriteClick : FirstEvent
    data object OnRecentClick : FirstEvent
}