package com.example.task4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter1(var list:ArrayList<String>) :RecyclerView.Adapter<Adapter1.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item1,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        var currentpostion = holder.adapterPosition
        holder.text.text = list[position]
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var text = item.findViewById<TextView>(R.id.rc_item1)
    }
}