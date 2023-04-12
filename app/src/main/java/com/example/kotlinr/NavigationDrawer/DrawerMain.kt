package com.example.kotlinr.NavigationDrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.kotlinr.R
import com.example.kotlinr.databinding.ActivityDrawerMainBinding

class DrawerMain : AppCompatActivity() {

    private lateinit var binding : ActivityDrawerMainBinding

    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawerMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            toggle = ActionBarDrawerToggle(this@DrawerMain,drawerLayout,R.string.open,R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            NavView.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.Home ->{}
                    R.id.About ->{}
                    R.id.Settings ->{}
                    R.id.Profile ->{}
                    R.id.Services ->{}
                }
                true
            }

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}