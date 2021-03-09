package com.example.submissionandroidpemula.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.submissionandroidpemula.R

class SplashscreenActivity : AppCompatActivity() {

    object Data {
        const val TIME_LENGTH = 3000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        goToApp()
    }

    private fun goToApp() {
        Handler().postDelayed({
            MainActivity.Start.start(this)
        }, Data.TIME_LENGTH.toLong())
    }
}