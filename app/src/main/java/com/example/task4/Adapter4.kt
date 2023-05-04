package com.example.task4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter4(var list:ArrayList<String>) :RecyclerView.Adapter<Adapter4.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item3,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        var currentpostion = holder.adapterPosition
        holder.apply {
            newText1.setText(list[position])
            newText2.setText(list[position])
            newText3.setText(list[position])
            newText4.setText(list[position])
            newText5.setText(list[position])
            newText6.setText(list[position])
        }
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var newText1 = item.findViewById<TextView>(R.id.newText1)
        var newText2 = item.findViewById<TextView>(R.id.newText2)
        var newText3 = item.findViewById<TextView>(R.id.newText3)
        var newText4 = item.findViewById<TextView>(R.id.newText4)
        var newText5 = item.findViewById<TextView>(R.id.newText5)
        var newText6 = item.findViewById<TextView>(R.id.newText6)
    }
}