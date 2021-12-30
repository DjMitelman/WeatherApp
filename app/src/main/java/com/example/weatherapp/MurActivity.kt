package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View


class MurActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mur)


    }

    fun ClickBack(view: android.view.View) {
        val intent = Intent(this@MurActivity, MainActivity::class.java)
        startActivity(intent)
    }

}