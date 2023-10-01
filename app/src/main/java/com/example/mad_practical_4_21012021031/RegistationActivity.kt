package com.example.mad_practical_4_21012021031

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

    class RegistationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registation)

        val Login: Button = findViewById(R.id.Loginbtn)
        Login.setOnClickListener {
            Intent(this@RegistationActivity, LoginActivity::class.java).also { startActivity(it) }
        }
    }
}