package com.example.kotlinr.NavigationDrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinr.NavigationDrawer.NavDrawerAdapters.ServicesAdapter
import com.example.kotlinr.NavigationDrawer.NavDrawerModels.NavModel
import com.example.kotlinr.R
import com.example.kotlinr.databinding.FragmentServicesBinding


class ServicesFragment : Fragment() {

   private var ServiceBinding : FragmentServicesBinding? = null
    private val binding get() = ServiceBinding!!

    private lateinit var arrayListService : ArrayList<NavModel>
    private lateinit var adapter: ServicesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        ServiceBinding = FragmentServicesBinding.inflate(inflater,container,false)

        arrayListService = ArrayList()

        arrayListService.add(NavModel(R.drawable.technical_support_service,"Technical Support Service"))
        arrayListService.add(NavModel(R.drawable.design_services,"Design Services"))
        arrayListService.add(NavModel(R.drawable.electrical_services,"Electrical Service"))
        arrayListService.add(NavModel(R.drawable.medical_services,"Medical Service"))
        arrayListService.add(NavModel(R.drawable.home_repair_service,"Home Repair Services"))
        arrayListService.add(NavModel(R.drawable.automobile_repair_services,"Automobile Services"))
        arrayListService.add(NavModel(R.drawable.shipping_services,"Shipping Services"))

        adapter = ServicesAdapter(arrayListService)
        binding.serviceRecyclerView.adapter = adapter
        binding.serviceRecyclerView.layoutManager = LinearLayoutManager(context)



        return binding.root
    }

}