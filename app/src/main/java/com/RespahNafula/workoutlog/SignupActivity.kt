package com.RespahNafula.workoutlog

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.RespahNafula.workoutlog.databinding.ActivityLoginBinding
import com.RespahNafula.workoutlog.databinding.ActivitySignupBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignupBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivitySignupBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_signup)


        binding.btnSignUp. setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }


        binding.tvLogin.setOnClickListener {
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)

    }

    }

     fun validateSignup() {
        var error = false
       binding.tilFirstName.error=null
        binding.tilLast.error=null
        binding.tilEmail.error=null
        binding.tilPassword.error = null
        binding.tilConfirm.error = null

        var firstname = binding.etFirstName.text.toString()
        if (firstname.isBlank()) {
            binding.tilFirstName.error = "password is required"
            error = true
        }
        var lastname= binding.etLast.text.toString()
        if(lastname.isBlank()){
           binding.tilLast .error="lastname is required"
            error=true
        }
        var Email=binding.etEmail.text.toString()
        if(Email.isBlank()){
            binding.tilEmail.error="Email is required"
            error=true
        }
        var password=binding.etPassword.text.toString()
        if(password.isBlank()){
            binding.tilPassword.error="password is required"
            error=true
        }
        var confirmPassword=binding.etConfirm.text.toString()
        if(confirmPassword.isBlank()){
            binding.tilConfirm.error="password confirmation  is required"
            error=true
        }
        if(!error){

        }
    }
}
