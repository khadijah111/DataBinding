package com.khadijahtech.databinding

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.khadijahtech.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding :ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

         var userObject  : User = User("Anas", "Ahmad", 23)
         binding.userVariable = userObject


        binding.userVariable?.name = "new name"
    }
}