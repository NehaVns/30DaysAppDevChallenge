package com.androidtutorials.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class BlockchainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain)
        val webView = findViewById<WebView>(R.id.webView)

        webViewSetUp(webView)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView : WebView){
        webView.webViewClient = WebViewClient()
        webView.apply{
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl(" https://www.simplilearn.com/blockchain-certification-training-course?utm_source=google&utm_medium=cpc&utm_term=web3%20course&utm_content=17672775279-137267729406-608871298754&utm_device=c&utm_campaign=Search-TechCluster-PG-SD-CBlockchain-Blockchain-IITK-AbsoluteBroadKeywords-IN-Main-AllDevice-adgroup-Blockchain-Program-Broad&gclid=CjwKCAiA3KefBhByEiwAi2LDHL1vjGagxyd30LXfyrvB1JWilPVACYnoMatQww2fisxWAlRzXsWU0hoCre8QAvD_BwE")
        }


    }
}