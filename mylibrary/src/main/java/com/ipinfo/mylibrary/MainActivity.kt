package com.ipinfo.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LaunchLib();
    }

    fun LaunchLib() {
        Toast.makeText(applicationContext,"Lib Launch",Toast.LENGTH_SHORT).show()
    }
}