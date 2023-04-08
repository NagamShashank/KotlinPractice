package com.example.kotlinr

import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinr.AdapterPack.RecyclerViewAdapter
import com.example.kotlinr.Model.Langdata
import com.example.kotlinr.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    private lateinit var adapter : RecyclerViewAdapter
    private lateinit var list : ArrayList<Langdata>
    private lateinit var newList : ArrayList<Langdata>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.recyclerViewLang.setHasFixedSize(true)

        list = ArrayList()

        list.add(Langdata(R.drawable.java_logo, "JAVA",""))
        list.add(Langdata(R.drawable.java_logo, "JAVA",""))
        list.add(Langdata(R.drawable.cplusplus_logo, "C++",""))
        list.add(Langdata(R.drawable.python_logo, "Python",""))
        list.add(Langdata(R.drawable.ruby_logo, "Ruby",""))
        list.add(Langdata(R.drawable.javascript_logo, "JavaScript",""))
        list.add(Langdata(R.drawable.angularjs_logo, "Angular",""))
        list.add(Langdata(R.drawable.csharp_logo, "C#",""))
        list.add(Langdata(R.drawable.kotlin_logo, "Kotlin",""))
        list.add(Langdata(R.drawable.swift_logo, "Swift",""))
        list.add(Langdata(R.drawable.css_logo, "CSS",""))
        list.add(Langdata(R.drawable.matlab_logo, "MatLab",""))
        list.add(Langdata(R.drawable.nodejs_logo, "Node JS",""))

        // Filtered The List and Removed the Duplicates From the Filtered List //

//        for (data in list){
//            if(data.LangText == "JAVA"){
//                if(!newList.contains(data))
//                newList.add(data)
//            }
//        }

//        list.filter { it.LangText == "JAVA" }.distinctBy { it.LangText =="JAVA" }

        // Removed Duplicates From List
//        newList = ArrayList()
//
//        for(data in list){
//            if(data in newList){
//                continue
//            }else{
//                newList.add(data)
//            }
//        }

        list.distinct()

        //newList.sortBy { it.LangText } //Sort By Ascending
        //newList.sortByDescending { it.LangText } //Sort By Descending

        adapter = RecyclerViewAdapter(list)
        binding.recyclerViewLang.adapter = adapter
        binding.recyclerViewLang.layoutManager = LinearLayoutManager(this)

    }


}




//list.filter { it.LangText == "JAVA" }.distinctBy { it.LangText } // Filtering and Removing the Duplicates
//list.sortBy { it.LangText } // Sort by Ascending
//list.sortByDescending { it.LangText } // Sort by Descending

//list.distinct()