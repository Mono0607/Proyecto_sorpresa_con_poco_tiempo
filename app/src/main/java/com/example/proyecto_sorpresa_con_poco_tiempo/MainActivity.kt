package com.example.proyecto_sorpresa_con_poco_tiempo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lavista=findViewById<BottomNavigationView>(R.id.navigationbotton)
        val controlnavegacion=findNavController(R.id.fragmentContainerView)
        lavista.setupWithNavController(controlnavegacion)
    }
}







