package com.example.kotlinr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinr.AdapterPack.NewAdapter
import com.example.kotlinr.Model.Langdata
import com.example.kotlinr.databinding.ActivityMain4Binding
import org.w3c.dom.Text

class MainActivity4 : AppCompatActivity(),NewAdapter.CheckData {

    private lateinit var  binding: ActivityMain4Binding

    private lateinit var adapter : NewAdapter

    private lateinit var NewList : ArrayList<Langdata>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        NewList = ArrayList()

        NewList.add(Langdata(R.drawable.java_logo,"",""))
        NewList.add(Langdata(R.drawable.angularjs_logo,"",""))
        NewList.add(Langdata(R.drawable.cplusplus_logo,"C++",""))
        NewList.add(Langdata(R.drawable.csharp_logo,"C#",""))
        NewList.add(Langdata(R.drawable.css_logo,"CSS",""))
        NewList.add(Langdata(R.drawable.javascript_logo,"JavaScript",""))
        NewList.add(Langdata(R.drawable.kotlin_logo,"Kotlin",""))
        NewList.add(Langdata(R.drawable.matlab_logo,"MatLab",""))
        NewList.add(Langdata(R.drawable.nodejs_logo,"Node JS",""))
        NewList.add(Langdata(R.drawable.python_logo,"Python",""))
        NewList.add(Langdata(R.drawable.ruby_logo,"Ruby",""))
        NewList.add(Langdata(R.drawable.swift_logo,"Swift",""))


        adapter = NewAdapter(NewList,this)
        binding.NewRecyclerView.adapter = adapter
        binding.NewRecyclerView.layoutManager = LinearLayoutManager(this)


    }

    override fun Check(result: ArrayList<Langdata>, text1: TextView, Picture: ImageView) {
        super.Check(result,text1, Picture)




    }
}








//for(i in 0 until result.size){
//    if(result[i].LangText.isEmpty()){
//        text1.visibility = View.GONE
//        Picture.visibility = View.GONE
//    }else{
//        text1.visibility = View.VISIBLE
//        Picture.visibility = View.VISIBLE
//
//        text1.text =  result[i].LangText
//        Picture.setImageResource(result[i].Picture)
//    }
//}