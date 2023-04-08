package com.example.kotlinr.AdapterPack

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinr.Model.Langdata
import com.example.kotlinr.databinding.ItemLayoutBinding

class RecyclerViewAdapter(val list:ArrayList<Langdata>):
    RecyclerView.Adapter<RecyclerViewAdapter.MyView> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        return MyView(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {

        holder.itemLayoutBinding.layoutImageView.setImageResource(list[position].Picture)
        holder.itemLayoutBinding.text1.text = list[position].LangText
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyView(val itemLayoutBinding: ItemLayoutBinding): RecyclerView.ViewHolder(itemLayoutBinding.root){}

}