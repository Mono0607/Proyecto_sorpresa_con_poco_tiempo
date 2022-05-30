package com.example.proyecto_sorpresa_con_poco_tiempo

import com.google.gson.annotations.SerializedName

data class DogResponse(
    @SerializedName("status") var status:String,
    @SerializedName("message") var images:List<String>
)