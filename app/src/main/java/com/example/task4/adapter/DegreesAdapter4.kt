package com.example.task4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task4.DegreesDAta
import com.example.task4.R

class DegreesAdapter4(var list:ArrayList<DegreesDAta>) :RecyclerView.Adapter<DegreesAdapter4.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item9,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        var currentpostion = holder.adapterPosition
        holder.apply {
            a.setText(list[position].string)
            b.setText(list[position].string)
            c.setText(list[position].string)
            a1.setImageResource(list[position].image)
            a2.setImageResource(list[position].image)
            a3.setImageResource(list[position].image)
            a4.setImageResource(list[position].image)

        }
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var a = item.findViewById<TextView>(R.id.b1)
        var b = item.findViewById<TextView>(R.id.b2)
        var c = item.findViewById<TextView>(R.id.b3)
        var a1 = item.findViewById<ImageView>(R.id.a1)
        var a2 = item.findViewById<ImageView>(R.id.a2)
        var a3 = item.findViewById<ImageView>(R.id.a3)
        var a4 = item.findViewById<ImageView>(R.id.a4)


    }
}