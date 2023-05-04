package com.example.task4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task4.R

class DegreesAdapter3(var list:ArrayList<String>) :RecyclerView.Adapter<DegreesAdapter3.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item8,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        var currentpostion = holder.adapterPosition
        holder.apply {
            a.setText(list[position])
            b.setText(list[position])
            c.setText(list[position])
            d.setText(list[position])
            e.setText(list[position])
            f.setText(list[position])
        }
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var a = item.findViewById<TextView>(R.id.textone)
        var b = item.findViewById<TextView>(R.id.texttwo)
        var c = item.findViewById<TextView>(R.id.textthree)
        var d = item.findViewById<TextView>(R.id.textfour)
        var e = item.findViewById<TextView>(R.id.textfive)
        var f = item.findViewById<TextView>(R.id.textsix)
    }
}