package com.androidtutorials.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class CardsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)
        val callButton = findViewById<Button>(R.id.btnCall)
        val androidButton = findViewById<Button>(R.id.btn1)
        val webDevButton = findViewById<Button>(R.id.btn2)
        val iosButton = findViewById<Button>(R.id.btn3)
        val machineLearningButton = findViewById<Button>(R.id.btn4)
        val blockchainButton = findViewById<Button>(R.id.btn5)
        val web3Button = findViewById<Button>(R.id.btn6)

        androidButton.setOnClickListener {
            intent = Intent(applicationContext, AndroidDevelopmentActivity::class.java)
            startActivity(intent)
        }
        webDevButton.setOnClickListener {
            intent = Intent(applicationContext, WebDevelopmentActivity::class.java)
            startActivity(intent)
        }
        iosButton.setOnClickListener {
            intent = Intent(applicationContext, IOSdevelopmentActivity::class.java)
            startActivity(intent)
        }
        machineLearningButton.setOnClickListener {
            intent = Intent(applicationContext, MachineLearningActivity::class.java)
            startActivity(intent)
        }
        blockchainButton.setOnClickListener {
            intent = Intent(applicationContext, BlockchainActivity::class.java)
            startActivity(intent)
        }
        web3Button.setOnClickListener {
            intent = Intent(applicationContext, Web3Activity::class.java)
            startActivity(intent)
        }

        callButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "**")
            startActivity(intent)
        }
    }
}