package com.example.calculadorageometricabeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ingresar = findViewById<Button>(R.id.btnIngresar);

        ingresar.setOnClickListener {
            val mostrar = Intent(this, activity_menu::class.java)
            startActivity(mostrar);
        }
    }
}