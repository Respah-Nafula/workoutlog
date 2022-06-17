package com.RespahNafula.workoutlog

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.RespahNafula.workoutlog.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        castViews()


        }
       fun castViews(){
          binding.btnLogin.setOnClickListener {
            validatelogin()
        }

        binding.btnLogin.setOnClickListener {
            val intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            validatelogin()
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }

     fun validatelogin() {
        var error = false
        binding.tilEmail.error = null
        binding.tilPassword.error = null

        val email =binding.etEmail.toString()
        if (email.isBlank()) {
            binding.etEmail.error = "Email is required"
            error = true
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tilEmail.error="Not a valid email address"
            error=true
        }
        val password =binding.etPassword.text.toString()
        if (password.isBlank()) {
            binding.etPassword.error = "password is required"
            error = true
        }
         if (!error){}

        }
    }
