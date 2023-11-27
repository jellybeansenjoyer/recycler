package com.example.senpai

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class F1ViewHolder(item:View):RecyclerView.ViewHolder(item){
   val textView=item.findViewById<TextView>(R.id.word)
   val genreView=item.findViewById<TextView>(R.id.team)
   val imageView=item.findViewById<ImageView>(R.id.image)
    fun bind(item:DataF1){
        textView.setText(item.name)
        genreView.setText(item.team)
        imageView.setImageResource(item.photo)
    }
}

class F1Adapter(private val data: List<DataF1>):RecyclerView.Adapter<F1ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):F1ViewHolder {
      val layoutInflator=LayoutInflater.from(parent.context)
        val view=layoutInflator.inflate(R.layout.itemlayout,parent,false)
        return F1ViewHolder(view)
    }

    override fun onBindViewHolder(holder: F1ViewHolder, position: Int) {
                var item=data[position]
                holder.bind(item)
            }

    override fun getItemCount()=data.size
}