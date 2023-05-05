package com.example.calculadorageometricabeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import kotlin.math.sqrt

class activity_cuadrado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuadrado)
        val lado = findViewById<EditText>(R.id.etLado)
        val area = findViewById<EditText>(R.id.etArea)
        val perimetro = findViewById<EditText>(R.id.etPerimetro)

        lado.addTextChangedListener(object: TextWatcher{
            var ladoDouble = lado.text.toString().toDoubleOrNull()
            override fun afterTextChanged(s: Editable) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                ladoDouble = lado.text.toString().toDoubleOrNull()
                if(lado.isFocused){
                    if(ladoDouble != null) {
                        area.setText((ladoDouble!! * ladoDouble!!).toString())
                        perimetro.setText((ladoDouble!! * 4).toString())
                    } else {
                        area.setText("")
                        perimetro.setText("")
                    }
                }
            }
        })

        area.addTextChangedListener(object: TextWatcher{
            var areaDouble = area.text.toString().toDoubleOrNull()
            override fun afterTextChanged(s: Editable) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                areaDouble = area.text.toString().toDoubleOrNull()
                if(area.isFocused){
                    if(areaDouble != null) {
                        lado.setText((sqrt(areaDouble!!)).toString())
                        perimetro.setText((sqrt(areaDouble!!) * 4).toString())
                    } else {
                        lado.setText("")
                        perimetro.setText("")
                    }
                }
            }
        })

        perimetro.addTextChangedListener(object: TextWatcher{
            var perimetroDouble = perimetro.text.toString().toDoubleOrNull()
            override fun afterTextChanged(s: Editable) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                perimetroDouble = perimetro.text.toString().toDoubleOrNull()
                if(perimetro.isFocused){
                    if(perimetroDouble != null) {
                        lado.setText((perimetroDouble!! / 4).toString())
                        area.setText(((perimetroDouble!! / 4) * (perimetroDouble!! / 4)).toString())
                    } else {
                        lado.setText("")
                        area.setText("")
                    }
                }
            }
        })

    }
}