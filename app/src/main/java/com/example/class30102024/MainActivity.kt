package com.example.class30102024

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.class30102024.R.layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(layout.activity_main)

        val etMontoBS: EditText = findViewById(R.id.etMontoBS)
        val btnDolar: Button = findViewById(R.id.btnDolar)
        val btnEuro: Button = findViewById(R.id.btnEuro)
        val btnNuevo: Button = findViewById(R.id.btnNuevo)

        val tvConversorTitle: TextView = findViewById(R.id.tvConversorTitle)
        val tvConversor: TextView = findViewById(R.id.tvConversor)



        btnDolar.setOnClickListener{
            val result = dolar(etMontoBS.text.toString().toInt())
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show();
            tvConversorTitle.text = "Conversor a Dolares:"
            tvConversor.text = String.format("%.2f", result)
        }

        btnEuro.setOnClickListener{
            val result = euro(etMontoBS.text.toString().toInt())
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show();
            tvConversorTitle.text = "Conversor a Euros:"
            tvConversor.text = String.format("%.2f", result)
        }

        fun nuevo(): Unit{
            etMontoBS.setText("")
            tvConversorTitle.setText("CONVERSOR")
            tvConversor.setText("")
        }

        btnNuevo.setOnClickListener{
            nuevo()
        }
    }

    fun dolar(n: Int): Double{
        return n / 6.97
    }

    fun euro(n: Int): Double{
        return n / 7.46
    }


}