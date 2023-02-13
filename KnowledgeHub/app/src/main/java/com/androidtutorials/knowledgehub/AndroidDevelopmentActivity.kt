package com.androidtutorials.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class AndroidDevelopmentActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_development)
        val webView = findViewById<WebView>(R.id.webView)

        webViewSetUp(webView)

    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView : WebView){
        webView.webViewClient = WebViewClient()
        webView.apply{
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://developer.android.com/?gclid=CjwKCAiA3KefBhByEiwAi2LDHOKaw5nm1P6NMee9jGjpLJCdR5DhE9378e6NHpkJXDbwt8NrCOnHMRoC38QQAvD_BwE&gclsrc=aw.ds")
        }


    }
}