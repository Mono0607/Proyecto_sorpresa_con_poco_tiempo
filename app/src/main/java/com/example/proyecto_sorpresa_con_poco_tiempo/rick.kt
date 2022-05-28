package com.example.proyecto_sorpresa_con_poco_tiempo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_sorpresa_con_poco_tiempo.adaptador.PersonajeAdapter
import com.example.proyecto_sorpresa_con_poco_tiempo.modelo.Personaje

class rick : Fragment() {
    lateinit var miRecycler: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val ventana= inflater.inflate(R.layout.fragment_rick, container, false)
        val listaPersonajes = ArrayList<Personaje>()

        listaPersonajes.add(Personaje("LALA ( ララ･サタリン・デビルーク)","https://images6.alphacoders.com/104/1040238.png"))
        listaPersonajes.add(Personaje("TAIGA AISAKA ( 逢坂 大河 )","https://images3.alphacoders.com/841/841345.png"))
        listaPersonajes.add(Personaje("MINORI KUSHIEDA (櫛枝 実乃梨 )","https://images4.alphacoders.com/733/733183.png"))
        listaPersonajes.add(Personaje("AMI KAWASHIMA ( 川嶋 亜美 )","https://images.alphacoders.com/104/1041700.jpg"))
        listaPersonajes.add(Personaje("MASHIRO SHIINA ( 椎名 ましろ)","https://images2.alphacoders.com/866/866103.png"))
        listaPersonajes.add(Personaje("DESUMI MEGAHAARA ( 禍原 デス美 )","https://images8.alphacoders.com/122/1229096.png"))
        listaPersonajes.add(Personaje("LALA ( ララ･サタリン・デビルーク)","https://images6.alphacoders.com/104/1040238.png"))



        miRecycler= ventana.findViewById(R.id.RecyclerPersonajes)

        miRecycler.adapter= PersonajeAdapter(listaPersonajes)
        miRecycler.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
        //GridLayoutManager
        //StaggeredGridLayoutManager
        return ventana
    }
}