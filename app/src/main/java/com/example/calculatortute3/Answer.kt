package com.example.calculatortute3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Answer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        var txtAnswer= findViewById<TextView>(R.id.textView2)
        txtAnswer.setText(intent.getDoubleExtra("answer",0.0).toString())
        var btnBack=findViewById<Button>(R.id.button)
        btnBack.setOnClickListener{
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }




    }
}