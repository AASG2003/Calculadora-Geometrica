package com.example.calculadorageometricabeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import kotlin.math.PI
import kotlin.math.cbrt
import kotlin.math.pow
import kotlin.math.sqrt

class activity_esfera : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esfera)

        val radio = findViewById<EditText>(R.id.etRadio)
        val circunferencia = findViewById<EditText>(R.id.etCircunferencia)
        val diametro = findViewById<EditText>(R.id.etDiametro)
        val volumen = findViewById<EditText>(R.id.etVol)

        radio.addTextChangedListener(object : TextWatcher {
            var radioDouble = radio.text.toString().toDoubleOrNull()

            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                radioDouble = radio.text.toString().toDoubleOrNull()
                if (radio.isFocused) {
                    if (radioDouble != null) {
                        circunferencia.setText((2 * PI * radioDouble!!).toString())
                        diametro.setText((2 * radioDouble!!).toString())
                        volumen.setText(((4 / 3.0) * PI * radioDouble!! * radioDouble!! * radioDouble!!).toString())
                    } else {
                        circunferencia.setText("")
                        diametro.setText("")
                        volumen.setText("")
                    }
                }
            }
        })

        circunferencia.addTextChangedListener(object : TextWatcher {
            var circunferenciaDouble = circunferencia.text.toString().toDoubleOrNull()

            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                circunferenciaDouble = circunferencia.text.toString().toDoubleOrNull()
                if (circunferencia.isFocused) {
                    if (circunferenciaDouble != null) {
                        radio.setText((circunferenciaDouble!! / (2 * PI)).toString())
                        diametro.setText((circunferenciaDouble!! / PI).toString())
                        volumen.setText(((4 / 3.0) * PI * (circunferenciaDouble!! / (2 * PI)).pow(3)).toString())
                    } else {
                        radio.setText("")
                        diametro.setText("")
                        volumen.setText("")
                    }
                }
            }
        })

        diametro.addTextChangedListener(object : TextWatcher {
            var diametroDouble = diametro.text.toString().toDoubleOrNull()

            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                diametroDouble = diametro.text.toString().toDoubleOrNull()
                if (diametro.isFocused) {
                    if (diametroDouble != null) {
                        radio.setText((diametroDouble!! / 2).toString())
                        circunferencia.setText((diametroDouble!! * PI).toString())
                        volumen.setText(((4 / 3.0) * PI * ((diametroDouble!! / 2) * (diametroDouble!! / 2) * (diametroDouble!! / 2))).toString())
                    } else {
                        radio.setText("")
                        circunferencia.setText("")
                        volumen.setText("")
                    }
                }
            }
        })

        volumen.addTextChangedListener(object : TextWatcher {
            var volumenDouble = volumen.text.toString().toDoubleOrNull()

            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                volumenDouble = volumen.text.toString().toDoubleOrNull()
                if (volumen.isFocused) {
                    if (volumenDouble != null) {
                        val radioDouble = ((3 * volumenDouble!!) / (4 * PI)).pow(1.0 / 3.0)
                        val circunferenciaDouble = 2 * PI * radioDouble
                        val diametroDouble= 2 * radioDouble

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
    }
}