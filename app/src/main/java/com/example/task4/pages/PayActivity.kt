package com.example.task4.pages

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task4.R
import com.example.task4.adapter.payAdapter

class PayActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)
        var recyclerView:RecyclerView = findViewById(R.id.pay_recycler)
        var list = arrayListOf<String>()
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        list = arrayListOf("15%OFF With Gold","On Bill Payments",
            "15%OFF With Gold","On Bill Payments","15%OFF With Gold","On Bill Payments","15%OFF With Gold","On Bill Payments","15%OFF With Gold","On Bill Payments","15%OFF With Gold","On Bill Payments",
        )
        var adapter  = payAdapter(list)

        recyclerView.adapter = adapter




    }
}