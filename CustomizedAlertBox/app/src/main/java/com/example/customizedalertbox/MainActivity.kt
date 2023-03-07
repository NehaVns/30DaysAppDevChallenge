package com.example.customizedalertbox
//steps 1  to 5 are for custom dialog implementation

import android.app.ActionBar
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customizedalertbox.databinding.ActivityMainBinding
import com.example.customizedalertbox.databinding.CustomDialogueBinding

class MainActivity : AppCompatActivity() {
    lateinit var dialog: Dialog                                     //1
    lateinit var bindingActivity: ActivityMainBinding
    lateinit var bindingAlert : CustomDialogueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingActivity = ActivityMainBinding.inflate(layoutInflater)
        bindingAlert = CustomDialogueBinding.inflate(layoutInflater)
        setContentView(bindingActivity.root)
        dialog = Dialog(this)                                //2
        dialog.setContentView(bindingAlert.root)                    //3
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))
        bindingActivity.btnClick.setOnClickListener {
            dialog.show()                                           //4
        }
        bindingAlert.btnFeedback.setOnClickListener {
            Toast.makeText(this, "Feedback submitted",Toast.LENGTH_SHORT).show()
            dialog.dismiss()                                        //5
        }
        bindingAlert.btnGood.setOnClickListener {
            Toast.makeText(this, "Happy Learning", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
    }
}