package com.example.kotlinr.NavigationDrawer

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kotlinr.*
import com.example.kotlinr.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    private var Homebinding : FragmentHomeBinding? = null
    private val binding get() = Homebinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        Homebinding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.ButtonRecyclerView.setOnClickListener(View.OnClickListener {
            view?.let {
                val intent = Intent(context,MainActivity2::class.java)
                startActivity(intent)
            }
        })

        binding.ButtonRecylerViewHG.setOnClickListener(View.OnClickListener {
            view?.let {
                val intent = Intent(context, MainActivity3::class.java)
                startActivity(intent)
            }
        })

        binding.ButtonNewRecyclerView.setOnClickListener(View.OnClickListener {
            view?.let {
                val intent = Intent(context, MainActivity4::class.java)
                startActivity(intent)
            }
        })

        binding.ButtonNewRecyclerView2.setOnClickListener(View.OnClickListener {
            view?.let {
                val intent = Intent(context, MainActivity5::class.java)
                startActivity(intent)
            }
        })

        return binding.root
    }


}