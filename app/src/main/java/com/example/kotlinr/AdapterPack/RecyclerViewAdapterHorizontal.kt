package com.example.kotlinr.AdapterPack

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinr.Model.Langdata
import com.example.kotlinr.databinding.ItemLayoutBinding
import com.example.kotlinr.databinding.ItemLayoutHorizontalBinding

class RecyclerViewAdapterHorizontal(val listH : ArrayList<Langdata>):
    RecyclerView.Adapter<RecyclerViewAdapterHorizontal.MyViewH> () {

    inner class MyViewH(val itemHorizontalLayoutBinding: ItemLayoutHorizontalBinding):
        RecyclerView.ViewHolder(itemHorizontalLayoutBinding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapterHorizontal.MyViewH {
        return MyViewH(ItemLayoutHorizontalBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapterHorizontal.MyViewH, position: Int) {
        holder.itemHorizontalLayoutBinding.HorizoneLangImg.setImageResource(listH[position].Picture)
        holder.itemHorizontalLayoutBinding.HorizoneLangText.text = listH[position].LangText
        holder.itemHorizontalLayoutBinding.HorizoneDescription.text = listH[position].LangDescription
    }

    override fun getItemCount(): Int {
        return listH.size
    }

    /*
    binding
    */






}