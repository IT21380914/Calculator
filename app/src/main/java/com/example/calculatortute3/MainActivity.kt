package com.example.calculatortute3

import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var Number1:EditText
    private lateinit var Number2:EditText
    private lateinit var addbtn:Button
    private lateinit var minusbtn:Button
    private lateinit var multbtn:Button
    private lateinit var dividebtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Number1 = findViewById(R.id.edtNumber1)
        Number2 = findViewById(R.id.edtNumber2)

        addbtn=findViewById(R.id.btnPlus)
        addbtn.setOnClickListener{ buttonClick(addbtn) }
        minusbtn=findViewById(R.id.btnMinus)
        minusbtn.setOnClickListener{buttonClick(minusbtn)}
        multbtn=findViewById(R.id.btnMultiply)
        multbtn.setOnClickListener{ buttonClick(multbtn) }
        dividebtn=findViewById(R.id.btnDivide)
        dividebtn.setOnClickListener{ buttonClick(dividebtn) }



    }

    fun buttonClick(v:View)
    {

        var ans = 0.0
        var calculator = Calculator(
            Number1.text.toString().toDouble(),
            Number2.text.toString().toDouble())

                when(v.id){
                    R.id.btnPlus -> ans=calculator.add()
                    R.id.btnMinus->ans=calculator.substract()
                    R.id.btnDivide->ans=calculator.divide()
                    R.id.btnMultiply->ans=calculator.multiply()
                }
        val intent = Intent(this,Answer::class.java)
        intent.putExtra("Answer",ans)
        startActivity(intent)
        finish()

    }



}

