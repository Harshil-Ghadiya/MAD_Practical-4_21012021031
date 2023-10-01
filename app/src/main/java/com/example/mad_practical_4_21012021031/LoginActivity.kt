package com.example.mad_practical_4_21012021031

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val Signup: Button = findViewById(R.id.signUp_btn)

        Signup.setOnClickListener {
            Intent(this@LoginActivity, RegistationActivity::class.java).also { startActivity(it) }
        }
    }
}