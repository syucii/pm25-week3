package com.example.pm25week3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Menghubungkan komponen
        val etName = findViewById<EditText>(R.id.etName)
        val btnHello = findViewById<Button>(R.id.btnHello)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        // Event tombol
        btnHello.setOnClickListener {

            val nama = etName.text.toString()

            if (nama.isNotEmpty()) {
                tvResult.text = "Hello, $nama "
            } else {
                tvResult.text = "Masukkan nama dulu yaa 🌸"
            }
        }
    }
}