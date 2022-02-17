package com.enesthedev.webview.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesthedev.webview.R

import kotlinx.android.synthetic.main.activity_splash_screen.splash_screen_iv

@Suppress("DEPRECATION")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        splash_screen_iv.animate().setDuration(1000).alpha(1f).withEndAction {
            startActivity(Intent(this, WebViewActivity::class.java))
            overridePendingTransition(androidx.constraintlayout.widget.R.anim.abc_fade_in, androidx.constraintlayout.widget.R.anim.abc_fade_out)
            finish()
        }
    }
}