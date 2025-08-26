package com.s1mple_dev.cmpsample

import androidx.compose.ui.window.ComposeUIViewController
import com.s1mple_dev.cmpsample.app.App
import com.s1mple_dev.cmpsample.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }