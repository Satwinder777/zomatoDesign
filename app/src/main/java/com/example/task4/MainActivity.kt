package com.example.task4

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.task4.pages.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = ArrayList<String>()
        val recyclerView1 = findViewById<RecyclerView>(R.id.rv1)
        val recyclerView2 = findViewById<RecyclerView>(R.id.rv2)
        val recyclerView3 = findViewById<RecyclerView>(R.id.rv3)
        val recyclerView4 = findViewById<RecyclerView>(R.id.rv4)
        val recyclerView5 = findViewById<RecyclerView>(R.id.rv5)
        recyclerView1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false)
        recyclerView2.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false)
        recyclerView3.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false)
        recyclerView4.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false)
        recyclerView5.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false)


        list = arrayListOf("Satwinder","singh","Sher","Gill","beat","With","yo","yo","honey")
        val adapter1 = Adapter1(list)
        val adapter2 = Adapter2(list)
        val adapter3 = Adapter3(list)
        val adapter4 = Adapter4(list)
        val adapter5 = Adapter5(list)



        recyclerView1.adapter = adapter1
        recyclerView2.adapter = adapter2
        recyclerView3.adapter = adapter3
        recyclerView4.adapter = adapter4
        recyclerView5.adapter = adapter5

        var text1 :TextView = findViewById(R.id.textView8)
        text1.setOnClickListener{
            val intent = Intent(this@MainActivity,PayActivity::class.java)
            startActivity(intent)
        }
        var click2 :CardView = findViewById(R.id.cardView7)
        click2.setOnClickListener{
            val intent = Intent(this@MainActivity,DegreesActivity::class.java)
            startActivity(intent)
        }
        var click3 : ImageView = findViewById(R.id.imageView7)
        click3.setOnClickListener{
            val intent = Intent(this@MainActivity,FoodDetailsActivity::class.java)
            startActivity(intent)
        }
        var click4 : TextView = findViewById(R.id.textView5)
        click4.setOnClickListener{
            val intent = Intent(this@MainActivity,Iphone_14::class.java)
            startActivity(intent)
        }
        var click5 : ImageView = findViewById(R.id.imageView41)
        click5.setOnClickListener{
            val intent = Intent(this@MainActivity,OfferForSearch::class.java)
            startActivity(intent)
        }


//        val scrollView = findViewById<ScrollView>(R.id.scrollView)
//
//        val linearLayout = LinearLayout(this)
//        linearLayout.orientation = LinearLayout.VERTICAL

// Your view elements here

//        scrollView.addView(linearLayout)
    }
}