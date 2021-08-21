package com.fcemtopall.patika_yemeksepeti_final.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fcemtopall.patika_yemeksepeti_final.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    }
}