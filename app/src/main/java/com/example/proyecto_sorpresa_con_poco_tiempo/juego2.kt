package com.example.proyecto_sorpresa_con_poco_tiempo

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.random.Random

class juego2 : Fragment() {
    lateinit var musicaFondo: MediaPlayer
    lateinit var respuestaUsuario: EditText
    lateinit var btnRespuesta: Button
    lateinit var sonidoRespuestaCorrecta: MediaPlayer
    lateinit var sonidoRespuestaIncorrecta: MediaPlayer
    var numeroGenerado = 0
    var numeroUsuario = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val ventana=inflater.inflate(R.layout.fragment_juego2, container, false)
        fun initUI(){
            btnRespuesta = ventana.findViewById(R.id.btnComprobar)
            respuestaUsuario = ventana.findViewById(R.id.etEntradaUsuario)
        }
        fun generaNumero(){
            numeroGenerado = Random.nextInt(1,7)

        }
        initUI()
        musicaFondo = MediaPlayer.create(requireContext(), R.raw.fondo)
        sonidoRespuestaCorrecta = MediaPlayer.create(requireContext(),R.raw.bien)
        sonidoRespuestaIncorrecta = MediaPlayer.create(requireContext(),R.raw.mal)
        reproduceMusica()
        generaNumero()

        btnRespuesta.setOnClickListener {
            val respuesta = respuestaUsuario.text.toString()
            if (respuesta.equals("")){
                Toast.makeText(requireContext(), "INSANO, PON TU RESPUESTA", Toast.LENGTH_LONG).show()
                sonidoIncorrecto()
            }else{
                numeroUsuario = respuesta.toInt()
                if(numeroGenerado==numeroUsuario){
                    sonidoCorrecto()
                    Toast.makeText(requireContext(), "BUUUUUUENAS", Toast.LENGTH_SHORT).show()
                }else{
                    sonidoIncorrecto()
                    Toast.makeText(requireContext(), "FIUUUUUUBA $numeroGenerado ", Toast.LENGTH_SHORT).show()

                }
                generaNumero()
            }
        }
        return ventana

    }
    override fun onStop() {
        super.onStop()
        musicaFondo.release()
        sonidoRespuestaCorrecta.release()
        sonidoRespuestaIncorrecta.release()
    }
    fun reproduceMusica(){
        musicaFondo.isLooping = true
        musicaFondo.setVolume(0.5f,0.5f)
        musicaFondo.start() // no need to call prepare(); create() does that for you
    }
    fun sonidoCorrecto(){
        sonidoRespuestaCorrecta.start()
    }
    fun sonidoIncorrecto(){
        sonidoRespuestaIncorrecta.start()
    }

}