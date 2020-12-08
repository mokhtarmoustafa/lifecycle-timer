package com.twoam.lifecycletimer

import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import timber.log.Timber

class MyTimer(lifecycle: Lifecycle) : LifecycleObserver {

    private var currentInterval: Int = 0
    private var handler = Handler(Looper.getMainLooper())
    lateinit var runnable: Runnable

    init {
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startTimer() {
        Timber.i("MainActivity - Timer is started.")
        runnable = Runnable {
            currentInterval++
            Timber.i("MainActivity -$currentInterval")
            handler.postDelayed(runnable, 1000)
        }

        handler.postDelayed(runnable, 1000)


    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopTimer() {
        Timber.i("MainActivity - Timer is stoped.")
        handler.removeCallbacks(runnable)
    }

}