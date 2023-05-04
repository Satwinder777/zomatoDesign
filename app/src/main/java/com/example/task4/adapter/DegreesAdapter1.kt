package com.example.task4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task4.R

class DegreesAdapter1(var list:ArrayList<String>) :RecyclerView.Adapter<DegreesAdapter1.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item6,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        var currentpostion = holder.adapterPosition
        holder.apply {
            c1.setText(list[position])

        }
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var c1 = item.findViewById<TextView>(R.id.onetext)

    }
}