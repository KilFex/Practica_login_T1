package com.elmodevs.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.elmodevs.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener{

            val password = binding.tPassword.text.toString()

            if (password.length < 8) {

                Toast.makeText(
                    this,
                    "La contraseña debe tener al menos 8 caracteres",
                    Toast.LENGTH_LONG
                ).show()
            } else {

                Toast.makeText(
                    this,
                    "Ingresado correctamente",
                    Toast.LENGTH_LONG
                ).show()

                val intent = Intent(this, Hour::class.java)
                startActivity(intent)
            }

        }
    }
}