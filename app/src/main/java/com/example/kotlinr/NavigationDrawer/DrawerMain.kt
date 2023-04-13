package com.example.kotlinr.NavigationDrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.kotlinr.R
import com.example.kotlinr.databinding.ActivityDrawerMainBinding

class DrawerMain : AppCompatActivity() {

    private lateinit var binding : ActivityDrawerMainBinding

    private lateinit var toggle: ActionBarDrawerToggle

    var ischecked:Boolean = false

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
                it.isChecked = true
                when(it.itemId){
                    R.id.Home ->{replaceFragment(HomeFragment(),it.title.toString())}
                    R.id.About ->{replaceFragment(AboutFragment(),it.title.toString())}
                    R.id.Settings ->{replaceFragment(SettingsFragment(),it.title.toString())}
                    R.id.Profile ->{replaceFragment(ProfileFragment(),it.title.toString())}
                    R.id.Services ->{replaceFragment(ServicesFragment(),it.title.toString())}

                    else -> {replaceFragment(HomeFragment(),it.title.toString())}
                }
                true
            }

        }


    }

    private fun replaceFragment(fragment:Fragment,title:String){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.Main_FrameLayout,fragment)
        fragmentTransaction.commit()
        setTitle(title)
        binding.drawerLayout.closeDrawers()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }


}


