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

class NewAdapter(val newList: ArrayList<Langdata>, val checkData: CheckData) :
    RecyclerView.Adapter<NewAdapter.MyNewView>() {


    inner class MyNewView(
        val itemLayoutBinding: ItemLayoutBinding,
    ) :
        RecyclerView.ViewHolder(itemLayoutBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewAdapter.MyNewView {
        return MyNewView(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NewAdapter.MyNewView, position: Int) {
        checkData.Check(
            newList,
            holder.itemLayoutBinding.text1,
            holder.itemLayoutBinding.layoutImageView
        )


    }

    override fun getItemCount(): Int {
        return newList.size
    }


    interface CheckData {
        fun Check(result: ArrayList<Langdata>, text1: TextView, Picture: ImageView) {}
    }
}