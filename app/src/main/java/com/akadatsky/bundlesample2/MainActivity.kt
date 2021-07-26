package com.akadatsky.bundlesample2

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.password)

        findViewById<Button>(R.id.next).setOnClickListener {
            Storage.status = "logined"
            val params = bundleOf(
                "login" to login.text.toString(),
                "password" to password.text.toString()
            )
            openNextActivity(SecondActivity::class.java, params)
        }
    }

}