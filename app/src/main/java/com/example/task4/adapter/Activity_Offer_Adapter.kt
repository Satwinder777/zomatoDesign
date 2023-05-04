package com.example.task4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task4.DegreesDAta
import com.example.task4.R

class Activity_Offer_Adapter(var list:ArrayList<DegreesDAta>) :RecyclerView.Adapter<Activity_Offer_Adapter.InerClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InerClass {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.item11,parent,false)
        return InerClass(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: InerClass, position: Int) {
        holder.apply {
            a.setText(list[position].string)
            b.setText(list[position].string)
            c.setText(list[position].string)
            d.setText(list[position].string)
            e.setText(list[position].string)
            f.setText(list[position].string)



            a7.setImageResource(list[position].image)
            a8.setImageResource(list[position].image)
            a9.setImageResource(list[position].image)


        }
    }
    class InerClass(item:View) :RecyclerView.ViewHolder(item) {
        var a = item.findViewById<TextView>(R.id.s1)
        var b = item.findViewById<TextView>(R.id.s2)
        var c = item.findViewById<TextView>(R.id.s3)
        var d = item.findViewById<TextView>(R.id.s4)
        var e = item.findViewById<TextView>(R.id.s5)
        var f = item.findViewById<TextView>(R.id.s6)

        var a7 = item.findViewById<ImageView>(R.id.s7)
        var a8 = item.findViewById<ImageView>(R.id.s8)
        var a9 = item.findViewById<ImageView>(R.id.s9)


    }
}