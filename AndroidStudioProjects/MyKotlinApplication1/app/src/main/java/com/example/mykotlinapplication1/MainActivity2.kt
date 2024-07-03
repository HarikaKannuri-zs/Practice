package com.example.mykotlinapplication1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    var usernameEditText: EditText?= null
    var passwordEditText: EditText? = null
    var loginBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        usernameEditText = findViewById(R.id.usernameEditText) as? EditText
        passwordEditText = findViewById(R.id.passwordEditText) as? EditText
        loginBtn = findViewById(R.id.loginBtn) as? Button

        loginBtn?.setOnClickListener {
            val username = usernameEditText?.text.toString()
            val password = passwordEditText?.text.toString()
            Log.d("LOGIN", "User credential we got: $username and $password")
            Toast.makeText(this@MainActivity2, "Hurray, User logged in successfully...!", Toast.LENGTH_SHORT).show()
        }
    }
}