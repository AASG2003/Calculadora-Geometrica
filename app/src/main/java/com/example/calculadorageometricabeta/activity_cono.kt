package com.example.calculadorageometricabeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import kotlin.math.PI

class activity_cono : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cono)

        val radio = findViewById<EditText>(R.id.etRadio)
        val altura = findViewById<EditText>(R.id.etAltura)
        val area = findViewById<TextView>(R.id.etArea)
        val volumen = findViewById<TextView>(R.id.etVolumen)
        val alturaInc = findViewById<EditText>(R.id.etAlturaInc)

        fun calcularAreaVolumen() {
            val radioDouble = radio.text.toString().toDoubleOrNull()
            val alturaDouble = altura.text.toString().toDoubleOrNull()
            val alturaIncDouble = alturaInc.text.toString().toDoubleOrNull()

            if (radioDouble != null && alturaDouble != null && alturaIncDouble != null) {
                val areaCono = (PI * radioDouble * (radioDouble * alturaIncDouble))
                val volumenCono = (Math.PI * radioDouble * radioDouble * alturaDouble) / 3.0
                area.text = areaCono.toString()
                volumen.text = volumenCono.toString()
            } else {
                area.text = ""
                volumen.text = ""
            }
        }


        radio.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                calcularAreaVolumen()
            }
        })

        altura.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
                calcularAreaVolumen()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                calcularAreaVolumen()
            }
        })

        alturaInc.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
                calcularAreaVolumen()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                calcularAreaVolumen()
            }
        })
    }
}