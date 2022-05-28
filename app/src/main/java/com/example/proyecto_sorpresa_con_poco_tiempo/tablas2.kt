package com.example.proyecto_sorpresa_con_poco_tiempo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlin.random.Random

var respuestaCorrecta = false

class tablas2 : Fragment() {

    lateinit var tvFactor1: TextView
    lateinit var tvFactor2: TextView
    lateinit var etRespuesta: EditText
    lateinit var btnVerificar: Button
    var factor1:Int = 0
    var factor2:Int = 0
    var producto:Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val ventana =  inflater.inflate(R.layout.fragment_tablas2, container, false)
        fun generaMultiplicacion(){
            factor1 = Random.nextInt(0,10)
            factor2 = Random.nextInt(0,10)
            producto = factor1*factor2
            tvFactor1.text = "$factor1"
            tvFactor2.text = "$factor2"
            etRespuesta.text.clear()

        }
        fun initUI(){
            tvFactor1 = ventana.findViewById(R.id.tvFactor1)
            tvFactor2 = ventana.findViewById(R.id.tvFactor2)
            etRespuesta = ventana.findViewById(R.id.etRespuesta)
            btnVerificar = ventana.findViewById(R.id.btnVerificar)

            generaMultiplicacion()

        }


        initUI()

        btnVerificar.setOnClickListener {
            var strRespuesta = etRespuesta.text.toString()
            if(strRespuesta.equals("")){
                Toast.makeText(requireContext(), "Respuesta Vacia", Toast.LENGTH_SHORT).show()

            }else{
                if (producto==strRespuesta.toInt()){

                    respuestaCorrecta=true
                }
                else{
                    respuestaCorrecta=false
                }
                findNavController().navigate(R.id.action_tablas2_to_tablas3)
            }

        }
        return ventana

    }

}