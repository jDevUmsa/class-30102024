package com.example.class30102024

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)

        val etci: EditText = findViewById(R.id.etci)
        val btnOrdenar: Button = findViewById(R.id.btnOrdenar)
        val btnnuevo: Button = findViewById(R.id.btnnuevo)

        val tvResultado: TextView = findViewById(R.id.tvResultado)

        btnOrdenar.setOnClickListener{
            val result = ordenar(etci.text.toString().toInt())
            tvResultado.setText("$result")

        }

        btnnuevo.setOnClickListener{
            etci.setText("")
            tvResultado.setText("")
        }
    }

    fun ordenar(numero: Int): Int {
        val digitos = mutableListOf<Int>()
        var num = numero

        while (num > 0) {
            digitos.add(num % 10)
            num /= 10
        }
        val digitosOrdenados = digitos.sorted().joinToString("").toInt()
        return digitosOrdenados
    }
}