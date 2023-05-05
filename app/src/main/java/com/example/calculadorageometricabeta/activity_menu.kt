package com.example.calculadorageometricabeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val cuadrado = findViewById<Button>(R.id.btnCuadrado)
        val circulo = findViewById<Button>(R.id.btnCirculo)
        cuadrado.setOnClickListener {
            val mostrar = Intent(this, activity_cuadrado::class.java)
            startActivity(mostrar)
        }

        circulo.setOnClickListener {
            val mostrar = Intent(this, activity_circulo::class.java)
            startActivity(mostrar)
        }
    }
}