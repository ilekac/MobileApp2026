package com.example.fueltracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Свързваме кода с дизайна (бутоните и полетата)
        val editLiters = findViewById<EditText>(R.id.editLiters)
        val editPrice = findViewById<EditText>(R.id.editPrice)
        val editKilometers = findViewById<EditText>(R.id.editKilometers)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnViewHistory = findViewById<Button>(R.id.btnViewHistory)

        // Какво става при натискане на "ЗАПАЗИ"
        btnSave.setOnClickListener {
            val liters = editLiters.text.toString()
            val price = editPrice.text.toString()
            val km = editKilometers.text.toString()

            if (liters.isNotEmpty() && price.isNotEmpty() && km.isNotEmpty()) {
                // Засега само ще показваме съобщение (Toast)
                // По-късно тук ще добавим записа в базата данни
                Toast.makeText(this, "Записано: $liters литра на $km км", Toast.LENGTH_LONG).show()

                // Изчистваме полетата след запис
                editLiters.text.clear()
                editPrice.text.clear()
                editKilometers.text.clear()
            } else {
                Toast.makeText(this, "Моля, попълнете всички полета!", Toast.LENGTH_SHORT).show()
            }
        }

        // Какво става при натискане на "ВИЖ ИСТОРИЯ"
        btnViewHistory.setOnClickListener {
            Toast.makeText(this, "Тук скоро ще има списък с всички записи!", Toast.LENGTH_SHORT).show()
        }
    }
}