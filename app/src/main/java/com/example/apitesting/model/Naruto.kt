package com.example.apitesting.model


import com.google.gson.annotations.SerializedName

class Naruto : ArrayList<Naruto.NarutoItem>(){
    data class NarutoItem(
        @SerializedName("anime")
        val anime: String,
        @SerializedName("character")
        val character: String,
        @SerializedName("quote")
        val quote: String
    )
}