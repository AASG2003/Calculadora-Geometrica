package com.example.calculadorageometricabeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class activity_rectangulo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangulo)

        val base = findViewById<EditText>(R.id.etBase)
        val altura = findViewById<EditText>(R.id.etAltura)
        val area = findViewById<TextView>(R.id.etArea)
        val perimetro = findViewById<TextView>(R.id.etPerimetro)

        fun calcularAreaPerimetro() {
            val baseDouble = base.text.toString().toDoubleOrNull()
            val alturaDouble = altura.text.toString().toDoubleOrNull()

            if (baseDouble != null && alturaDouble != null) {
                val areaTriangulo = (baseDouble * alturaDouble)
                val perimetroTriangulo = 2 * (baseDouble + alturaDouble)

                area.text = areaTriangulo.toString()
                perimetro.text = perimetroTriangulo.toString()
            } else {
                area.text = ""
                perimetro.text = ""
            }
        }

        base.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                calcularAreaPerimetro()
            }
        })

        altura.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                calcularAreaPerimetro()
            }
        })
    }
}