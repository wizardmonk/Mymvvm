package com.example.mymvvm.apihandler

import com.example.mymvvm.model.NewResponse
import com.example.mymvvm.model.Quoteresponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteService {
    @GET("/quotes")
    suspend fun getQuote(@Query("page") page: Int): Response<Quoteresponse>

    @GET("top-headlines")
    suspend fun getNews(@Query("country") country:String,@Query("apiKey") apikey:String ):Response<NewResponse>
}