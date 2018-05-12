package com.example.xoana.casadecambio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pesos = findViewById<EditText>(R.id.pesostb) as EditText
        val euros = findViewById<EditText>(R.id.eurostb) as EditText
        val boton = findViewById<Button>(R.id.Convertir) as Button
      val con = pesos.text.toString()
        boton.setOnClickListener{
            euros.setText((pesos.text.toString().toDouble()*(0.04437)).toString())
        }
    }
}
