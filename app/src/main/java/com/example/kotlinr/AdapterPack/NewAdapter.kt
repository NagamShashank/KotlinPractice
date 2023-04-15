package com.example.kotlinr.AdapterPack

import android.graphics.Picture
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinr.Model.Langdata
import com.example.kotlinr.databinding.ItemLayoutBinding

class NewAdapter(val newList: ArrayList<Langdata>,private val checkDataListener: CheckDataListener) :
    RecyclerView.Adapter<NewAdapter.MyNewView>() {


    inner class MyNewView(
        val itemLayoutBinding: ItemLayoutBinding,checkDataListener: CheckDataListener) :
        RecyclerView.ViewHolder(itemLayoutBinding.root) {



        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewAdapter.MyNewView {
        return MyNewView(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false),checkDataListener)
    }
//
    override fun onBindViewHolder(holder: NewAdapter.MyNewView, position: Int) {

        holder.itemLayoutBinding.text1.text = newList[position].LangText
        holder.itemLayoutBinding.layoutImageView.setImageResource(newList[position].Picture)

        checkDataListener.checkListener(holder.itemView,position)

    }

    override fun getItemCount(): Int {
        return newList.size
    }



    interface CheckDataListener {
        fun checkListener(view:View,position: Int){}
    }

//    interface CheckData {
//        fun Check(result: ArrayList<Langdata>, text1: TextView, Picture: ImageView) {}
//    }
}