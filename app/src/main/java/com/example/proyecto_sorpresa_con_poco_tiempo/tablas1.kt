package com.example.proyecto_sorpresa_con_poco_tiempo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class tablas1 : Fragment() {
    lateinit var btnPracticar: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val ventana=inflater.inflate(R.layout.fragment_tablas1, container, false)
        btnPracticar = ventana.findViewById(R.id.btnIrAPracticar)

        btnPracticar.setOnClickListener {
            findNavController().navigate(R.id.action_tablas1_to_tablas2)
        }

        return ventana
    }


}