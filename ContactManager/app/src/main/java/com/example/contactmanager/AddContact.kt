package com.example.contactmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactmanager.databinding.ActivityAddContactBinding

class AddContact : AppCompatActivity() {
    private lateinit var binding : ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = intent.getStringExtra(Login.KEY1)
        val password = intent.getStringExtra(Login.KEY2)
        val name = intent.getStringExtra(Login.KEY3)

        binding.textView2.text = name
    }
}