package com.akadatsky.bundlesample2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.password)

        findViewById<Button>(R.id.next).setOnClickListener {

            Storage.status = "logined"

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("login", login.text.toString())
                putExtra("password", password.text.toString())
            }
            startActivity(intent)
        }

    }

}