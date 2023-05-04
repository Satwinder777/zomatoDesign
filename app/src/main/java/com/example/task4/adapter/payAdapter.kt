package com.example.task4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task4.R

class payAdapter(var list:ArrayList<String>) :RecyclerView.Adapter<payAdapter.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item5,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        var currentpostion = holder.adapterPosition
        holder.apply {
            c1.setText(list[position])
            c2.setText(list[position])
            g1.setText(list[position])
            g2.setText(list[position])
        }
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var c1 = item.findViewById<TextView>(R.id.crowntext1)
        var c2 = item.findViewById<TextView>(R.id.crowntext2)
        var g1 = item.findViewById<TextView>(R.id.goldentext1)
        var g2 = item.findViewById<TextView>(R.id.goldentext2)
    }
}