package com.example.alertdialiguebox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialiguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        val mainLayout = binding.root
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Reset Settings?")
            builder1.setMessage("Are you sure you want to continue?")
            builder1.setIcon(R.drawable.baseline_settings_24)
            builder1.setPositiveButton("OK", DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when "OK" is clicked
//                finish()

            })
            builder1.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialogInterface, i ->

                // What action should be performed when "Cancel" is clicked
            })
            builder1.show()

        }

        binding.btn2.setOnClickListener {
            val options = arrayOf("Gulab Jaamun", "Rasmalayi", "Kaju Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when the user clicks on any action
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when "OK" is clicked
//                finish()

            })
            builder2.setNegativeButton("DECLINE", DialogInterface.OnClickListener { dialogInterface, i ->

                // What action should be performed when "Cancel" is clicked
            })
            builder2.show()
        }

        binding.btn3.setOnClickListener {
            val builder3 = AlertDialog.Builder(this)
            val options = arrayOf("Java", "Web Dev", "Android Dev", "Python", "HTML", "Docker", "Kuberbetes")
            builder3.setTitle("Choose Skills")
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when "OK" is clicked
//                finish()

            })
            builder3.setNegativeButton("DECLINE", DialogInterface.OnClickListener { dialogInterface, i ->

                // What action should be performed when "Cancel" is clicked
            })
            builder3.show()

        }

    }
}