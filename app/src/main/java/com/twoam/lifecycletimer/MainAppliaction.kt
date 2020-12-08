package com.twoam.lifecycletimer

import android.app.Application
import timber.log.Timber

class MainAppliaction : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}