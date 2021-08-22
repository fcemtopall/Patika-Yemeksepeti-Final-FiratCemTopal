package com.fcemtopall.patika_yemeksepeti_final

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GastronoutApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}