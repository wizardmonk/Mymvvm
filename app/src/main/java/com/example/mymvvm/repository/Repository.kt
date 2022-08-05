package com.example.mymvvm.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymvvm.apihandler.QuoteService
import com.example.mymvvm.apihandler.Quotebuilder
import com.example.mymvvm.model.Article
import com.example.mymvvm.model.Result
import kotlinx.coroutines.*

class Repository() {

    var Newsdata: QuoteService = Quotebuilder.getquote().create(QuoteService::class.java)


    fun getNewsData(): ArrayList<Article> {
        //var quoteList = ArrayList<Article>()
        var quoteList=ArrayList<Article>()

        GlobalScope.launch {
            var getdata = Newsdata.getNews("in", "7a5bc649bddf431e9817ff4cc4cc5798")

            var result = getdata.body()
            if (result != null) {
                Log.d("Api", result.articles[0].toString())
                quoteList.addAll(result.articles)
            }

            Log.d("Api", "Data")
            //Log.d("ApiList", quoteList.size.toString())


        }






    return quoteList
}
}