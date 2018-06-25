package com.example.kkk.androidapp10

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        buttonsecond.setOnClickListener( object : View.OnClickListener {
            override fun onClick(v: View?) {
                finish()
            }

        })
    }
}
