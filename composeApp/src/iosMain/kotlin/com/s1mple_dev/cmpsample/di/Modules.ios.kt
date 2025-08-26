package com.s1mple_dev.cmpsample.di

import com.s1mple_dev.cmpsample.sample.data.database.DatabaseFactory
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module
    get() = module {
        single { DatabaseFactory() }
    }