package com.example.task4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter5(var list:ArrayList<String>) :RecyclerView.Adapter<Adapter5.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item4,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        var currentpostion = holder.adapterPosition
        holder.apply {
            last1.setText(list[position])
            last2.setText(list[position])
        }
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var last1 = item.findViewById<TextView>(R.id.last1)
        var last2 = item.findViewById<TextView>(R.id.last2)
    }
}