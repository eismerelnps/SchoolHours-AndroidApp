package com.elnps.horario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webView)
       // val refreshButton: Button = findViewById(R.id.refreshButton)

//        refreshButton.setOnClickListener {
//            webView.reload()
//        }

        val url = "https://eismerelnps.github.io/Horario/"
//        webView.clearCache(true)
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webView.loadUrl(url)
    }

}