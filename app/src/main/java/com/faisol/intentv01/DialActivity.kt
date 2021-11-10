package com.faisol.intentv01

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DialActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBack: Button
    private lateinit var btnCall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dial)

        btnBack = findViewById(R.id.btn_back)
        btnBack.setOnClickListener(this)

        btnCall = findViewById(R.id.btn_call)
        btnCall.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v !=null){
            when(v.id){
                R.id.btn_back -> run{
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_call -> run{
                    var dial = "081335163659"
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +dial))
                    startActivity(intent)
                }
            }
        }
    }
}