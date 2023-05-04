package com.example.task4.pages

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.task4.DegreesDAta
import com.example.task4.R
import com.example.task4.adapter.*

class DegreesActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_degrees)
        var rc1:RecyclerView =  findViewById(R.id.dr1)
        var rc2:RecyclerView =  findViewById(R.id.dr2)
        var rc3:RecyclerView =  findViewById(R.id.dr3)
        var rc4:RecyclerView =  findViewById(R.id.dr4)
        var rc5:RecyclerView =  findViewById(R.id.dr5)
        var list = arrayListOf<String>("satwinder","satwindersingh","satwindersher","satwindergill","satwinderkumar","satwindertiger","satwindergood",)
//        var alist = arrayListOf<String>("satwinder","satwindersingh","satwindersher","satwindergill","satwinderkumar","satwindertiger","satwindergood",)
        var adlist = arrayListOf<DegreesDAta>(DegreesDAta(R.drawable.girl1,"Prankster"),DegreesDAta(R.drawable.pizza2,"Taj Cafe"),DegreesDAta(R.drawable.girl2,"Amritsari"),DegreesDAta(R.drawable.pizza3,"Prankster"),DegreesDAta(R.drawable.girl3,"Amritsari"),DegreesDAta(R.drawable.pizza3,"Prankster"),DegreesDAta(R.drawable.pizza1,"Amritsari"),DegreesDAta(R.drawable.pizza2,"Prankster"),DegreesDAta(R.drawable.pizza3,"Amritsari"),)
        var a1 = DegreesAdapter1(list)
        var a2 = DegreesAdapter2(adlist)
        var a3 = DegreesAdapter3(list)
        var a4 = DegreesAdapter4(adlist)
        var a5 = DegreesAdapter5(adlist)
        rc1.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rc2.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rc3.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rc4.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rc5.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        rc1.adapter = a1
        rc2.adapter = a2
        rc3.adapter = a3
        rc4.adapter = a4
        rc5.adapter = a5


    }
}