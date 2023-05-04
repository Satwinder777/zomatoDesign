package com.example.task4.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task4.DegreesDAta
import com.example.task4.R
import com.example.task4.adapter.Activity_Offer_Adapter

class OfferForSearch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer_for_search)

        val rc :RecyclerView = findViewById(R.id.rc12)
        var list = arrayListOf<DegreesDAta>(DegreesDAta(R.drawable.img21,"satwinder"),
            DegreesDAta(R.drawable.img22,"singh"),
            DegreesDAta(R.drawable.img23,"sher"),
            DegreesDAta(R.drawable.img21,"gill"),
            DegreesDAta(R.drawable.img22,"possibility"),)
        val adapter = Activity_Offer_Adapter(list)
        rc.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rc.adapter = adapter
    }
}