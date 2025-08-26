package com.s1mple_dev.cmpsample.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.s1mple_dev.cmpsample.sample.data.database.DatabaseFactory
import com.s1mple_dev.cmpsample.sample.data.database.SampleDatabase
import com.s1mple_dev.cmpsample.sample.presentation.second.SecondScreenViewModel
import com.s1mple_dev.cmpsample.sample.presentation.first.FirstScreenViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf

import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<SampleDatabase>().sampleDao }


    viewModelOf(::FirstScreenViewModel)
    viewModelOf(::SecondScreenViewModel)
}