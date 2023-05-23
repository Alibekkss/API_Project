package com.example.apitesting.retrofit

import com.example.apitesting.repository.APIservice
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://animechan.vercel.app/api/quotes/"

    val retrofitCall = getClient().create(APIservice::class.java)

    fun getClient(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}