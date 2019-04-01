package com.uzzal.signinsignupmd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         //to change title of a activity
        val actionBar = supportActionBar
        actionBar!!.title = "Sign In"


        val btn = findViewById<Button>(R.id.button4);

        btn.setOnClickListener {

            val intent = Intent(applicationContext, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
