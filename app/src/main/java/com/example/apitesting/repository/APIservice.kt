package com.example.apitesting.repository

import com.example.apitesting.model.Naruto
import retrofit2.http.GET

interface APIservice {
    @GET("anime?title=naruto")
    suspend fun getNaruto():Naruto
}