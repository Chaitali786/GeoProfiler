package com.geoprofiler.chaiqai.geoprofiler

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_screen.*


class HomeScreen : AppCompatActivity() {
    // Home Button Items

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        login_btn.setOnClickListener()
        {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
        help_btn.setOnClickListener(){
            val intent = Intent (this, Help::class.java )
            startActivity(intent)
            finish()

        }
        setting_btn.setOnClickListener(){
            val intent = Intent (this, Settings::class.java )
            startActivity(intent)
            finish()

        }
    }


}
