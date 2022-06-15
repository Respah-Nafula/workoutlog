package com.RespahNafula.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var tvLogin: TextView
    lateinit var tilFirstName: TextInputLayout
    lateinit var etFirstName: TextInputEditText
    lateinit var tilLast: TextInputLayout
    lateinit var etLast: TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var tilpassword: TextInputLayout
    lateinit var etpassword: TextInputEditText
    lateinit var tilconfirmpassword: TextInputLayout
    lateinit var etconfirmpassword: TextInputEditText
    lateinit var btnSignUp:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        tilFirstName=findViewById(R.id.tilFirstName)
        etFirstName=findViewById(R.id.etFirstName)
        tilLast=findViewById(R.id.tilLast)
        etLast=findViewById(R.id.etLast)
        tilEmail=findViewById(R.id.tilEmail)
        etEmail=findViewById(R.id.etEmail)
        tilpassword=findViewById(R.id.tilPassword)
        etpassword=findViewById(R.id.etPassword)
        tilconfirmpassword=findViewById(R.id.tilConfirm)
        etconfirmpassword=findViewById(R.id.etConfirm)
        tvLogin=findViewById(R.id.tvLogin)
        btnSignUp=findViewById(R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }


        tvLogin.setOnClickListener {
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)

    }

    }

     fun validateSignup() {
        var error = false
        tilFirstName.error=null
        tilLast.error=null
        tilEmail.error=null
        tilpassword.error = null
        tilconfirmpassword.error = null

        var firstname = etFirstName.text.toString()
        if (firstname.isBlank()) {
            tilFirstName.error = "password is required"
            error = true
        }
        var lastname= etLast.text.toString()
        if(lastname.isBlank()){
            tilLast.error="lastname is required"
            error=true
        }
        var Email=etEmail.text.toString()
        if(Email.isBlank()){
            tilEmail.error="Email is required"
            error=true
        }
        var password=etpassword.text.toString()
        if(password.isBlank()){
            tilpassword.error="password is required"
            error=true
        }
        var confirmPassword=etconfirmpassword.text.toString()
        if(confirmPassword.isBlank()){
            tilconfirmpassword.error="password confirmation  is required"
            error=true
        }
        if(!error){

        }
    }
}
