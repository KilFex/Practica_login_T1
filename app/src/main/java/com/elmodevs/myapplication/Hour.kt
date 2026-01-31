package com.elmodevs.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.elmodevs.myapplication.databinding.ActivityHourBinding


class Hour : AppCompatActivity() {

    private lateinit var binding: ActivityHourBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHourBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnInicio.setOnClickListener{
            finish()
        }
    }
}