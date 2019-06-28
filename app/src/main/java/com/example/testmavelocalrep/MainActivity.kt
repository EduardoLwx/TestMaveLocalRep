package com.example.testmavelocalrep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myandroidlibrary.LibClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, LibClass.constant, Toast.LENGTH_LONG).show()
    }
}
