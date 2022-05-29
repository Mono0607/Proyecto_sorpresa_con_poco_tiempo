package com.example.proyecto_sorpresa_con_poco_tiempo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class juego1 : Fragment() {
    lateinit var btnIniciar : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val ventana=inflater.inflate(R.layout.fragment_juego1, container, false)
        btnIniciar = ventana.findViewById(R.id.btnComenzar)

        btnIniciar.setOnClickListener {
        findNavController().navigate(R.id.action_juego1_to_juego2)
        }
        return ventana
    }
}