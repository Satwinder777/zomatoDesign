package com.example.task4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter2(var list:ArrayList<String>) :RecyclerView.Adapter<Adapter2.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item2,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        var currentpostion = holder.adapterPosition
        holder.apply {
            top1.setText(list[position])
            top2.setText(list[position])
            top3.setText(list[position])
        }
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var top1 = item.findViewById<TextView>(R.id.top1)
        var top2 = item.findViewById<TextView>(R.id.top2)
        var top3 = item.findViewById<TextView>(R.id.top3)
    }
}