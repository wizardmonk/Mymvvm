package com.example.mymvvm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymvvm.apihandler.QuoteService
import com.example.mymvvm.apihandler.Quotebuilder
import com.example.mymvvm.model.Article
import com.example.mymvvm.model.Quoteresponse
import com.example.mymvvm.model.Result
import com.example.mymvvm.repository.Repository
import com.example.mymvvm.viewmodel.QuoteAdapter
import com.example.mymvvm.viewmodel.ViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var quoteadapter: QuoteAdapter
    var quoteList=ArrayList<Article>()
    lateinit var viewmodel1:ViewModel
    lateinit var repo:Repository

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Quotedata:QuoteService= Quotebuilder.getquote().create(QuoteService::class.java)

//        viewmodel1=ViewModelProvider(this).get(ViewModel::class.java)
//
//        viewmodel1.getQuoteData()

        quoteList= repo.getNewsData()


        }
        quoteadapter = QuoteAdapter(quoteList)

        mainview.layoutManager = LinearLayoutManager(this)

        mainview.adapter = quoteadapter


            quoteList.addAll()
            //Log.d("ApiData", it.size.toString())
            quoteadapter.notifyDataSetChanged()








    }
}