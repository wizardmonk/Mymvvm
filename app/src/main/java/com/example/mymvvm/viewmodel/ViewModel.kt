package com.example.mymvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.mymvvm.apihandler.QuoteService
import com.example.mymvvm.model.Article
import com.example.mymvvm.model.Result
import com.example.mymvvm.repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

class ViewModel: ViewModel() {
    var repo=Repository()

    }


