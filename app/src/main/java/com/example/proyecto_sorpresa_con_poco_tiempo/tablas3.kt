package com.example.proyecto_sorpresa_con_poco_tiempo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieAnimationView

class tablas3 : Fragment() {
    lateinit var animView: LottieAnimationView
    lateinit var texto: TextView
    lateinit var regresar: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val ventana= inflater.inflate(R.layout.fragment_tablas3, container, false)
        animView = ventana.findViewById(R.id.animation_view)
        texto = ventana.findViewById(R.id.textView3)
        regresar=ventana.findViewById(R.id.btnRegresar)
       regresar.setOnClickListener {
           findNavController().navigate(R.id.action_tablas3_to_tablas2)
       }
        if (respuestaCorrecta) {
            animView.setAnimation(R.raw.correcto)
            texto.setText("Okeyapulo")
        } else {
            animView.setAnimation(R.raw.error)
            texto.setText("Ponete la pilas papa")

        }
        return ventana
    }

}