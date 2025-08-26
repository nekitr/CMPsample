package com.s1mple_dev.cmpsample.di

import com.s1mple_dev.cmpsample.sample.data.database.DatabaseFactory
import org.koin.android.ext.koin.androidApplication
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module
    get() = module {
        single { DatabaseFactory(androidApplication()) }
    }