package com.faisol.intentv01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MoveActivityForResult : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBack: Button
    private lateinit var btnChoose: Button
    var rgColor: RadioGroup? = null
    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        btnBack = findViewById(R.id.btn_back)
        btnBack.setOnClickListener(this)

        rgColor = findViewById(R.id.rg_color)
        btnChoose = findViewById(R.id.btn_choose)
        btnChoose.setOnClickListener{
            val selectedOption: Int = rgColor!!.checkedRadioButtonId
            radioButton = findViewById(selectedOption)

            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle()
            bundle.putString("Color", radioButton.text as String?)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }

    override fun onClick(v: View?) {
        if (v !=null){
            when(v.id){
                R.id.btn_back -> run{
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}