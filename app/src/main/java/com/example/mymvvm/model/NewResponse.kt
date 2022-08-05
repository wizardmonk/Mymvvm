package com.example.mymvvm.model

data class NewResponse(
    val articles: ArrayList<Article>,
    val status: String,
    val totalResults: Int
)