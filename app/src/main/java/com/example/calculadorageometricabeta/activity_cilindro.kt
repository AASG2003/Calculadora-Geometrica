package com.example.calculadorageometricabeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import java.lang.Math.pow
import kotlin.math.PI

class activity_cilindro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cilindro)

        val radio = findViewById<EditText>(R.id.etRadio)
        val altura = findViewById<EditText>(R.id.etAltura)
        val area = findViewById<TextView>(R.id.etArea)
        val volumen = findViewById<TextView>(R.id.etVolumen)



        radio.addTextChangedListener(object : TextWatcher {
            var radioDouble = radio.text.toString().toDoubleOrNull()
            var alturaDouble = altura.text.toString().toDoubleOrNull()

            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                radioDouble = radio.text.toString().toDoubleOrNull()
                alturaDouble = altura.text.toString().toDoubleOrNull()
                if (radio.isFocused) {
                    if (radioDouble != null && alturaDouble != null) {
                        area.setText((2 * PI * radioDouble!!*(radioDouble!! + alturaDouble!!)).toString())
                        volumen.setText((PI * radioDouble!! * radioDouble!! * alturaDouble!!).toString())
                    } else {
                        area.setText("")
                        volumen.setText("")
                    }
                }
            }
        })

        altura.addTextChangedListener(object : TextWatcher {
            var radioDouble = radio.text.toString().toDoubleOrNull()
            var alturaDouble = altura.text.toString().toDoubleOrNull()

            override fun afterTextChanged(s: Editable?) {
                // Este método se llama después de que el texto ha cambiado
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Este método se llama antes de que el texto cambie
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Este método se llama cuando el texto cambia
                radioDouble = radio.text.toString().toDoubleOrNull()
                alturaDouble = altura.text.toString().toDoubleOrNull()
                if (altura.isFocused) {
                    if (radioDouble != null && alturaDouble != null) {
                        area.setText((2 * PI * radioDouble!!*(radioDouble!! + alturaDouble!!)).toString())
                        volumen.setText((PI * radioDouble!! * radioDouble!! * alturaDouble!!).toString())
                    } else {
                        area.setText("")
                        volumen.setText("")
                    }
                }
            }
        })
    }
}