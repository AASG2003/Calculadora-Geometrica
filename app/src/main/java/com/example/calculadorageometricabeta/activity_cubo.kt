package com.example.calculadorageometricabeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import kotlin.math.cbrt
import kotlin.math.pow
import kotlin.math.sqrt

class activity_cubo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cubo)

        val lado = findViewById<EditText>(R.id.etLado)
        val area = findViewById<EditText>(R.id.etArea)
        val perimetro = findViewById<EditText>(R.id.etPerimetro)
        val volumen = findViewById<EditText>(R.id.etVolumen)

        lado.addTextChangedListener(object: TextWatcher {
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
                        area.setText((ladoDouble!! * ladoDouble!! * 6).toString())
                        perimetro.setText((ladoDouble!! * 12).toString())
                        volumen.setText((ladoDouble!! * ladoDouble!! * ladoDouble!!).toString())
                    } else {
                        area.setText("")
                        perimetro.setText("")
                        volumen.setText("")
                    }
                }
            }
        })

        area.addTextChangedListener(object: TextWatcher {
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
                        lado.setText((sqrt(areaDouble!!/6)).toString())
                        val ladoDouble = lado.text.toString().toDoubleOrNull()
                        perimetro.setText((sqrt(areaDouble!!) * 12).toString())
                        volumen.setText((ladoDouble!! * ladoDouble * ladoDouble).toString())
                    } else {
                        lado.setText("")
                        perimetro.setText("")
                        volumen.setText("")
                    }
                }
            }
        })

        perimetro.addTextChangedListener(object: TextWatcher {
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
                        lado.setText((perimetroDouble!! / 12).toString())
                        val ladoDouble = lado.text.toString().toDoubleOrNull()
                        area.setText(((perimetroDouble!! / 12) * (perimetroDouble!! / 12) * 6).toString())
                        volumen.setText((ladoDouble!! * ladoDouble * ladoDouble).toString())
                    } else {
                        lado.setText("")
                        area.setText("")
                        volumen.setText("")
                    }
                }
            }
        })

        volumen.addTextChangedListener(object: TextWatcher {
            var volumenDouble = volumen.text.toString().toDoubleOrNull()

            override fun afterTextChanged(s: Editable) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                volumenDouble = volumen.text.toString().toDoubleOrNull()
                if(volumen.isFocused){
                    if(volumenDouble != null) {
                        lado.setText((cbrt(volumenDouble!!)).toString())
                        val ladoDouble = lado.text.toString().toDoubleOrNull()
                        perimetro.setText((ladoDouble!! * 12).toString())
                        area.setText((ladoDouble * ladoDouble * 6).toString())
                    } else {
                        lado.setText("")
                        perimetro.setText("")
                        area.setText("")
                    }
                }
            }
        })
    }
}