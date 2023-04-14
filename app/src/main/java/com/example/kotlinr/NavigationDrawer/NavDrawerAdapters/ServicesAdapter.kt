package com.example.kotlinr.NavigationDrawer.NavDrawerAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinr.NavigationDrawer.NavDrawerModels.NavModel
import com.example.kotlinr.databinding.ItemLayoutHorizontalBinding
import com.example.kotlinr.databinding.ServicesItemLayoutBinding

class ServicesAdapter(val Servicelist: ArrayList<NavModel>): RecyclerView.Adapter<ServicesAdapter.MyServiceView>() {

    var checktext :Boolean = false


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicesAdapter.MyServiceView {
        return MyServiceView(ServicesItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ServicesAdapter.MyServiceView, position: Int) {
        holder.itemServiceLayoutBinding.ServiceName.text = Servicelist[position].SName
        holder.itemServiceLayoutBinding.ServicesIcon.setImageResource(Servicelist[position].SImage)

        holder.itemServiceLayoutBinding.ItemLayout.setOnClickListener(View.OnClickListener {
            if(checktext == false){
                holder.itemServiceLayoutBinding.Description.visibility = View.VISIBLE
                checktext = true
            }else{
                checktext = false
                holder.itemServiceLayoutBinding.Description.visibility = View.GONE
            }

            notifyItemChanged(position)
        })

    }

    override fun getItemCount(): Int {
         return Servicelist.size
    }

    inner class MyServiceView(val itemServiceLayoutBinding: ServicesItemLayoutBinding  ):RecyclerView.ViewHolder(itemServiceLayoutBinding.root){}

}