package com.dev_candra.constrainlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initToolbar()
    }

    private fun initToolbar(){
        supportActionBar?.title = "Candra Julius Sinaga"
        supportActionBar?.subtitle = "Latihan Constraint Layout"
    }
}