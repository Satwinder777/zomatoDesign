package com.example.task4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task4.DegreesDAta
import com.example.task4.R

class DegreesAdapter2(var list:ArrayList<DegreesDAta>) :RecyclerView.Adapter<DegreesAdapter2.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item7,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        var currentpostion = holder.adapterPosition
        holder.apply {
            c1.setBackgroundResource(list[position].image)

        }
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var c1 = item.findViewById<ImageView>(R.id.image1)

    }
}