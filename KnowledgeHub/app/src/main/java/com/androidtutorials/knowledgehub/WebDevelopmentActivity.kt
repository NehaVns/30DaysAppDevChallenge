package com.androidtutorials.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class WebDevelopmentActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_development)
        val webView = findViewById<WebView>(R.id.webView)

        webViewSetUp(webView)

    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView : WebView){
        webView.webViewClient = WebViewClient()
        webView.apply{
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.geeksforgeeks.org/web-development/")
        }


    }
}