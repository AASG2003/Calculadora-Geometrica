package com.example.calculadorageometricabeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

class activity_circulo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circulo)
        val radio = findViewById<EditText>(R.id.etRadio)
        val diametro = findViewById<EditText>(R.id.etDiametro)
        val area = findViewById<EditText>(R.id.etArea)
        val circunferencia = findViewById<EditText>(R.id.etCircunferencia)

        radio.addTextChangedListener(object: TextWatcher {
            var radioDouble = radio.text.toString().toDoubleOrNull()
            override fun afterTextChanged(s: Editable) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                radioDouble = radio.text.toString().toDoubleOrNull()
                if(radio.isFocused){
                    if(radioDouble != null) {
                        val areaDouble = Math.PI * radioDouble!! * radioDouble!!
                        val circunferenciaDouble = 2 * Math.PI * radioDouble!!
                        val diametroDouble = 2 * radioDouble!!
                        area.setText(areaDouble.toString())
                        circunferencia.setText(circunferenciaDouble.toString())
                        diametro.setText(diametroDouble.toString())
                    } else {
                        area.setText("")
                        circunferencia.setText("")
                        diametro.setText("")
                    }
                }
            }
        })

        diametro.addTextChangedListener(object: TextWatcher {
            var diametroDouble = diametro.text.toString().toDoubleOrNull()
            override fun afterTextChanged(s: Editable) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                diametroDouble = diametro.text.toString().toDoubleOrNull()
                if(diametro.isFocused){
                    if(diametroDouble != null) {
                        val radioDouble = diametroDouble!! / 2
                        val areaDouble = Math.PI * radioDouble * radioDouble
                        val circunferenciaDouble = 2 * Math.PI * radioDouble
                        area.setText(areaDouble.toString())
                        circunferencia.setText(circunferenciaDouble.toString())
                        radio.setText(radioDouble.toString())
                    } else {
                        area.setText("")
                        circunferencia.setText("")
                        radio.setText("")
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
                        val radioDouble = Math.sqrt(areaDouble!! / Math.PI)
                        val circunferenciaDouble = 2 * Math.PI * radioDouble
                        val diametroDouble = 2 * radioDouble
                        radio.setText(radioDouble.toString())
                        circunferencia.setText(circunferenciaDouble.toString())
                        diametro.setText(diametroDouble.toString())
                    } else {
                        radio.setText("")
                        circunferencia.setText("")
                        diametro.setText("")
                    }
                }
            }
        })

        circunferencia.addTextChangedListener(object: TextWatcher {
            var circunferenciaDouble = circunferencia.text.toString().toDoubleOrNull()
            override fun afterTextChanged(s: Editable) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                circunferenciaDouble = circunferencia.text.toString().toDoubleOrNull()
                if(circunferencia.isFocused){
                    if(circunferenciaDouble != null) {
                        val radioDouble = circunferenciaDouble!! / (2 * Math.PI)
                        val areaDouble = Math.PI * radioDouble * radioDouble
                        val diametroDouble = 2 * radioDouble
                        area.setText(areaDouble.toString())
                        radio.setText(circunferenciaDouble.toString())
                        diametro.setText(diametroDouble.toString())
                    } else {
                        area.setText("")
                        radio.setText("")
                        diametro.setText("")
                    }
                }
            }
        })


    }
}