package com.example.kotlinr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinr.AdapterPack.NewAdapter2
import com.example.kotlinr.Model.Langdata
import com.example.kotlinr.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {

    private lateinit var binding : ActivityMain5Binding

    private lateinit var New_List : ArrayList<Langdata>

    private lateinit var adapter: NewAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        New_List = ArrayList()

        New_List.add(Langdata(R.drawable.java_logo,"JAVA",""))
        New_List.add(Langdata(R.drawable.angularjs_logo,"Angular",""))
        New_List.add(Langdata(R.drawable.cplusplus_logo,"C++",""))
        New_List.add(Langdata(R.drawable.csharp_logo,"C#",""))
        New_List.add(Langdata(R.drawable.css_logo,"CSS",""))
        New_List.add(Langdata(R.drawable.javascript_logo,"JavaScript",""))
        New_List.add(Langdata(R.drawable.kotlin_logo,"Kotlin",""))
        New_List.add(Langdata(R.drawable.matlab_logo,"MatLab",""))
        New_List.add(Langdata(R.drawable.nodejs_logo,"Node JS",""))
        New_List.add(Langdata(R.drawable.python_logo,"Python",""))
        New_List.add(Langdata(R.drawable.ruby_logo,"Ruby",""))
        New_List.add(Langdata(R.drawable.swift_logo,"Swift",""))

        adapter = NewAdapter2(New_List)
        binding.newRecyclerview.adapter = adapter
        binding.newRecyclerview.layoutManager = LinearLayoutManager(this)
        
    }
}