package com.twoam.lifecycletimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    lateinit var btnStopTimer:Button
    lateinit var timer: MyTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timer=MyTimer(lifecycle)

        Timber.i("onCreate is called")
        btnStopTimer=findViewById<Button>(R.id.btnStopTimer)
        btnStopTimer.setOnClickListener {
            timer.stopTimer()
        }
    }


    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart is called")

    }
    override fun onStart() {
        super.onStart()
        Timber.i("onStart is called")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume is called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause is called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy is called")
    }
}