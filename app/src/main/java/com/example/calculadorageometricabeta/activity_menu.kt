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
        val triangulo = findViewById<Button>(R.id.btnTriangulo)
        val cubo = findViewById<Button>(R.id.btnCubo)
        val esfera = findViewById<Button>(R.id.btnEsfera)
        val cilindro = findViewById<Button>(R.id.btnCilindro)
        val cono = findViewById<Button>(R.id.btnCono)
        val rectangulo = findViewById<Button>(R.id.btnRectangulo)
        cuadrado.setOnClickListener {
            val mostrar = Intent(this, activity_cuadrado::class.java)
            startActivity(mostrar)
        }

        circulo.setOnClickListener {
            val mostrar = Intent(this, activity_circulo::class.java)
            startActivity(mostrar)
        }

        triangulo.setOnClickListener {
            val mostrar = Intent(this, activity_triangulo::class.java)
            startActivity(mostrar)
        }

        cubo.setOnClickListener {
            val mostrar = Intent(this, activity_cubo::class.java)
            startActivity(mostrar)
        }

        esfera.setOnClickListener {
            val mostrar = Intent(this, activity_esfera::class.java)
            startActivity(mostrar)
        }

        cilindro.setOnClickListener {
            val mostrar = Intent(this, activity_cilindro::class.java)
            startActivity(mostrar)
        }

        cono.setOnClickListener {
            val mostrar = Intent(this, activity_cono::class.java)
            startActivity(mostrar)
        }

        rectangulo.setOnClickListener {
            val mostrar = Intent(this, activity_rectangulo::class.java)
            startActivity(mostrar)
        }
    }
}