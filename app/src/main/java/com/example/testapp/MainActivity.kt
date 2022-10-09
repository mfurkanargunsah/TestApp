package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var design:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      design =  DataBindingUtil.setContentView(this,R.layout.activity_main)

        design.sonuc.text = "0"

        design.topla.setOnClickListener{

            val input1 = design.number1.text.toString()
            val input2 = design.number2.text.toString()

            val number1 = input1.toInt()
            val number2 = input2.toInt()

            val total = number1 + number2

            design.sonuc.text = total.toString()

            design.number1.text.clear()
            design.number2.text.clear()

        }

        design.carp.setOnClickListener{

            val input1 = design.number1.text.toString()
            val input2 = design.number2.text.toString()

            val number1 = input1.toInt()
            val number2 = input2.toInt()

            val total = number1 * number2

            design.sonuc.text = total.toString()

            design.number1.text.clear()
            design.number2.text.clear()


        }

    }
}