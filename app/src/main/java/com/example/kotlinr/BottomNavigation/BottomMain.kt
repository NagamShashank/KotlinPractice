package com.example.kotlinr.BottomNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kotlinr.NavigationDrawer.*
import com.example.kotlinr.R
import com.example.kotlinr.databinding.ActivityBottomMainBinding

class BottomMain : AppCompatActivity() {

    private lateinit var binding : ActivityBottomMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceBottomFragment(HomeFragment())

        binding.BottomNavView.setOnItemSelectedListener {
            it.isChecked = true
            when(it.itemId){
                R.id.Bottom_Home ->{replaceBottomFragment(HomeFragment())}
                R.id.Bottom_Profile ->{replaceBottomFragment(ProfileFragment())}
                R.id.Bottom_Services ->{replaceBottomFragment(ServicesFragment())}

                else -> {replaceBottomFragment(HomeFragment())}
            }

            true
        }

    }

    private fun replaceBottomFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.BottomFrameLayout,fragment)
        fragmentTransaction.commit()


    }


}