package com.example.kotlinr.AdapterPack

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinr.Model.Langdata
import com.example.kotlinr.databinding.ItemLayoutGridLayoutBinding
import com.example.kotlinr.databinding.ItemLayoutHorizontalBinding

class RecyclerViewAdapterGrid(val listG : ArrayList<Langdata>): RecyclerView.Adapter<RecyclerViewAdapterGrid.MyViewGrid>() {

    inner class MyViewGrid(val itemGridlLayoutBinding: ItemLayoutGridLayoutBinding):
        RecyclerView.ViewHolder(itemGridlLayoutBinding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapterGrid.MyViewGrid {
        return MyViewGrid(ItemLayoutGridLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapterGrid.MyViewGrid, position: Int) {
        holder.itemGridlLayoutBinding.GridLangImg.setImageResource(listG[position].Picture)
        holder.itemGridlLayoutBinding.GridLangText.text = listG[position].LangText
    }

    override fun getItemCount(): Int {
        return listG.size
    }
}