package com.androidtutorials.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MachineLearningActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine_learning)
        val webView = findViewById<WebView>(R.id.webView)

        webViewSetUp(webView)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView : WebView){
        webView.webViewClient = WebViewClient()
        webView.apply{
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.upgrad.com/machine-learning-ai-pgd-iiitb/?utm_source=GOOGLE&utm_campaign=IND_ACQ_WEB_GOOGLE_NBSEARCH_DV_IIITB_EML_HIT_T1_UNKNOWN&utm_content=Machine_Learning&utm_term=ml%20course&gclid=CjwKCAiA3KefBhByEiwAi2LDHOyHrm2bCMJC663bj3SPWplvDNdZfQ9SXgOO3jZagKWjR-7Qekfz2xoCLLEQAvD_BwE")
        }


    }
}