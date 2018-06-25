package com.example.kkk.androidapp10

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val website : String = "http://www.google.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message.text = website
        val uri = Uri.parse(website)
        val intent1 = Intent(Intent.ACTION_VIEW,uri)

        message.setOnClickListener({ v ->  v.setBackgroundColor(Color.YELLOW)
                                            startActivity(intent1)
                                    })

        buttonfirst.text = "Click to go"
        val intent2 = Intent(this,SecondActivity::class.java)
        buttonfirst.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                startActivity(intent2)
            }
        })



    }

}
