package com.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bean.customer
import com.studydemo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var c=customer()
        c.value=30
        Log.e("NiceStarsX",c.value.toString())
    }
}
