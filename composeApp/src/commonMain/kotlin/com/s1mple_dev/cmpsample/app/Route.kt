package com.s1mple_dev.cmpsample.app

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object MainGraphRoute : Route

    @Serializable
    data object MainListRoute : Route

    @Serializable
    data class FileDetailsRoute(val id: String) : Route
}