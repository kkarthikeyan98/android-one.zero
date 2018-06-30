package com.example.kkk.androidapp10

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val website : String = "http://www.google.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<View>(R.id.toolbar1) as Toolbar
        setSupportActionBar(toolbar)

        message.text = website
        val uri = Uri.parse(website)
        val intent1 = Intent(Intent.ACTION_VIEW,uri)

        message.setOnClickListener { v ->  v.setBackgroundColor(Color.YELLOW)
            startActivity(intent1)
        }

        buttonfirst.text = "Click to go"
        val intent2 = Intent(this,SecondActivity::class.java)
        buttonfirst.setOnClickListener { startActivity(intent2) }


    }

}
