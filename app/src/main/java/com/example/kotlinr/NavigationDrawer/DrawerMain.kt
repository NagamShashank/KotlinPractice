package com.example.kotlinr.NavigationDrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kotlinr.R
import com.example.kotlinr.databinding.ActivityDrawerMainBinding
import com.google.android.material.navigation.NavigationView
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener

class DrawerMain : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener{

    private lateinit var binding : ActivityDrawerMainBinding
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawerMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            navController =  findNavController(R.id.fragmentView)
            binding.NavView.setupWithNavController(navController)

            actionBarDrawerToggle = ActionBarDrawerToggle(DrawerMain(),binding.drawerLayout,R.string.close,R.string.open)

            binding.drawerLayout.addDrawerListener(actionBarDrawerToggle)
            actionBarDrawerToggle.syncState()
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)

            binding.NavView.setNavigationItemSelectedListener(this@DrawerMain)

        }

    }

    override fun onSupportNavigateUp(): Boolean {

        navController =  findNavController(R.id.fragmentView)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.Home -> {Toast.makeText(applicationContext,"Hello Home Fragment",Toast.LENGTH_SHORT).show()}
            R.id.About->{Toast.makeText(applicationContext,"Hello About Fragment",Toast.LENGTH_SHORT).show()}
            R.id.Profile ->{Toast.makeText(applicationContext,"Hello Profile Fragment",Toast.LENGTH_SHORT).show()}
            R.id.Services ->{Toast.makeText(applicationContext,"Hello Services Fragment",Toast.LENGTH_SHORT).show()}
            R.id.Settings ->{Toast.makeText(applicationContext,"Hello Settings Fragment",Toast.LENGTH_SHORT).show()}
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if(actionBarDrawerToggle.onOptionsItemSelected(item))
            true
        else
        super.onOptionsItemSelected(item)
    }

}













