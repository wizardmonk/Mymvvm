package com.example.mymvvm.viewmodel

import android.util.Log
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymvvm.R
import com.example.mymvvm.model.Article
import com.example.mymvvm.model.Result

class QuoteAdapter(val item:List<Article>): RecyclerView.Adapter<QuoteAdapter.quoteview>() {




    class quoteview(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var quotetitle:TextView =itemView.findViewById(R.id.maintitle)
        var quotecontent:TextView =itemView.findViewById(R.id.content)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): quoteview {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.viewmain,parent,false)
        return quoteview(view)
    }

    override fun onBindViewHolder(holder: quoteview, position: Int) {
        val ItemsViewModel = item[position]
        Log.d("resultapidata",ItemsViewModel.author)
        holder.quotetitle.text=ItemsViewModel.author
        holder.quotecontent.text=ItemsViewModel.content

    }

    override fun getItemCount(): Int {
        Log.d("ApiListSize",item.size.toString())
        return item.size
    }

}