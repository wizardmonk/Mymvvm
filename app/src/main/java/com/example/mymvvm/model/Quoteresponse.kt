package com.example.mymvvm.model

data class Quoteresponse(
    var count: Int,
    var lastItemIndex: Int,
    var page: Int,
    var results: ArrayList<Result>,
    var totalCount: Int,
    var totalPages: Int
)