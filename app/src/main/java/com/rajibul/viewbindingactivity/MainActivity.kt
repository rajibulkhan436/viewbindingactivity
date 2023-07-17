package com.rajibul.viewbindingactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rajibul.viewbindingactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding :ActivityMainBinding ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.btnSubmit?.setOnClickListener {
            if(binding?.etName?.text?.toString().isNullOrEmpty()){
                binding?.etName?.error = "Enter your name"
            }  else if (binding?.etCollegeName?.text.isNullOrEmpty()){
            binding?.etCollegeName?.error="Enter something about college"
        }else if (binding?.etPhoneNumber?.text.toString().length<10){
            binding?.etPhoneNumber?.error="enter your phone Number"
        }else{
            Toast.makeText(this, "Details submitted successfully", Toast.LENGTH_LONG).show()
}}}}