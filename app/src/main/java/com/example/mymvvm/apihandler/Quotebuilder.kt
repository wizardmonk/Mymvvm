package com.example.mymvvm.apihandler

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Quotebuilder {
//https://newsapi.org/v2/top-headlines?country=in&apiKey=7a5bc649bddf431e9817ff4cc4cc5798
//https://newsapi.org/v2/top-headlines?country=in&apiKey=7a5bc649bddf431e9817ff4cc4cc5798
    val BASE_URL= "https://newsapi.org/v2/"
    fun getquote():Retrofit{
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}