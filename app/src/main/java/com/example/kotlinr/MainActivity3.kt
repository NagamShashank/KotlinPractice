package com.example.kotlinr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinr.AdapterPack.RecyclerViewAdapterGrid
import com.example.kotlinr.AdapterPack.RecyclerViewAdapterHorizontal
import com.example.kotlinr.Model.Langdata
import com.example.kotlinr.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding : ActivityMain3Binding

    private lateinit var adapter : RecyclerViewAdapterHorizontal

    private lateinit var adapterGrid : RecyclerViewAdapterGrid

    private lateinit var listHarray : ArrayList<Langdata>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.HRecyclerView.hasFixedSize()
        binding.GRecyclerView.hasFixedSize()

        listHarray = ArrayList()

        listHarray.add(Langdata(R.drawable.java_logo, "JAVA",
            "Java is a general-purpose, class-based, object-oriented programming language designed for having lesser implementation dependencies. It is a computing platform for application development. Java is fast, secure, and reliable, therefore. It is widely used for developing Java applications in laptops, data centers, game consoles, scientific supercomputers, cell phones, etc."))
        listHarray.add(Langdata(R.drawable.cplusplus_logo, "C++",""))
        listHarray.add(Langdata(R.drawable.python_logo, "Python",""))
        listHarray.add(Langdata(R.drawable.ruby_logo, "Ruby",""))
        listHarray.add(Langdata(R.drawable.javascript_logo, "JavaScript",""))
        listHarray.add(Langdata(R.drawable.angularjs_logo, "Angular",""))
        listHarray.add(Langdata(R.drawable.csharp_logo, "C#",""))
        listHarray.add(Langdata(R.drawable.kotlin_logo, "Kotlin",""))
        listHarray.add(Langdata(R.drawable.swift_logo, "Swift",""))
        listHarray.add(Langdata(R.drawable.css_logo, "CSS",""))
        listHarray.add(Langdata(R.drawable.matlab_logo, "MatLab",""))
        listHarray.add(Langdata(R.drawable.nodejs_logo, "Node JS",""))

        adapter = RecyclerViewAdapterHorizontal(listHarray)
        binding.HRecyclerView.adapter = adapter
        binding.HRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        adapterGrid = RecyclerViewAdapterGrid((listHarray))
        binding.GRecyclerView.adapter = adapterGrid
        binding.GRecyclerView.layoutManager = GridLayoutManager(applicationContext,3)
    }
}