package com.akadatsky.bundlesample2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val login = findViewById<TextView>(R.id.sample)
        val status = findViewById<TextView>(R.id.status)

        login.text = "${intent.getStringExtra("login")}\n${intent.getStringExtra("password")}"
        status.text = Storage.status

    }
}