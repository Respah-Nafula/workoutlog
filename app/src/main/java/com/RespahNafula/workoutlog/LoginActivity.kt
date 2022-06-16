package com.RespahNafula.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
     lateinit var btnLogin: Button
     lateinit var tilEmail: TextInputLayout
     lateinit var etEmail: TextInputEditText
     lateinit var tilPassword: TextInputLayout
     lateinit var etPassword: TextInputEditText
     lateinit var tvSignUp:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        btnLogin=findViewById(R.id.btnLogin)
        tilPassword = findViewById(R.id.tilPassword)
        tilEmail = findViewById(R.id.tilEmail)
        etPassword = findViewById(R.id.etPassword)
        etEmail = findViewById(R.id.etEmail)
        tvSignUp= findViewById(R.id.tvLogin)
        btnLogin.setOnClickListener {
            validatelogin()
        }

        tvSignUp.setOnClickListener {
            val intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            validatelogin()
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }

     fun validatelogin() {
        var error = false
        tilEmail.error = null
        tilPassword.error = null

        val email = etEmail.text.toString()
        if (email.isBlank()) {
            tilEmail.error = "Email is required"
            error = true
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            tilEmail.error="Not a valid email address"
            error=true
        }
        val password = etPassword.text.toString()
        if (password.isBlank()) {
            tilPassword.error = "password is required"
            error = true
        }
         if (error!=true){}

        }
    }
