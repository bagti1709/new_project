package com.example.iteradmin.new_project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View) {
      when (v.id){
          R.id.login ->{
              Toast.makeText(applicationContext,"LOGIN",Toast.LENGTH_LONG).show()
          }
          R.id.forget ->{
              Toast.makeText(applicationContext,"FORGET",Toast.LENGTH_LONG).show()
          }
      }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.login)
        val forget = findViewById<Button>(R.id.forget)

        login.setOnClickListener(this)
        forget.setOnClickListener(this)

    }
}