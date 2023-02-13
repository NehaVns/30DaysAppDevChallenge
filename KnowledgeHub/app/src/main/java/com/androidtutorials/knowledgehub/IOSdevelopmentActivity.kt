package com.androidtutorials.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class IOSdevelopmentActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iosdevelopment)
        val webView = findViewById<WebView>(R.id.webView)

        webViewSetUp(webView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView : WebView){
        webView.webViewClient = WebViewClient()
        webView.apply{
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://developer.apple.com/tutorials/app-dev-training")
        }


    }
}