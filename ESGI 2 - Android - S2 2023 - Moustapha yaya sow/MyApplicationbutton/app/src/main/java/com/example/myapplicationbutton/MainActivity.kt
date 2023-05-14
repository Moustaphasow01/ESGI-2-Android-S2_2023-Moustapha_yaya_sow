package com.example.myapplicationbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplicationbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var i=0;
        //setContentView(R.layout.activity_main)
        val  binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button.setOnClickListener {
            binding.textView.text="$i";
            i+=1;
        }
    }
}