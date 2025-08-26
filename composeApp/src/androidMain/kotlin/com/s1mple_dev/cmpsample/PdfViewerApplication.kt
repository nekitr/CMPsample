package com.s1mple_dev.cmpsample

import android.app.Application
import com.s1mple_dev.cmpsample.di.initKoin
import org.koin.android.ext.koin.androidContext

class PdfViewerApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@PdfViewerApplication)
        }
    }
}