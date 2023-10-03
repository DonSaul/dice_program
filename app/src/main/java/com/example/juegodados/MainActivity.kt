package com.example.juegodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tirarboton: Button = findViewById(R.id.button)
        tirarboton.setOnClickListener{lanzardado()}

    }

    private fun lanzardado(){

        val dado= Dado(6)
        val tirada= dado.tirar()

        val vistadado: TextView = findViewById(R.id.textView)

        vistadado.text= tirada.toString()
    }
}



class Dado(private val lados:Int){

        fun tirar(): Int{

            return(1..lados).random()
        }
}