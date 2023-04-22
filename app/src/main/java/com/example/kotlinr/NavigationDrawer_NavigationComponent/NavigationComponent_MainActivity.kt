package com.example.kotlinr.NavigationDrawer_NavigationComponent

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kotlinr.R
import com.google.android.material.navigation.NavigationView

class NavigationComponent_MainActivity : AppCompatActivity() {

    private lateinit var toolbar : androidx.appcompat.widget.Toolbar
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView : NavigationView
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_component_main)

        toolbar = findViewById(R.id.My_Toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.NavCompDrawerLayout)
        navigationView = findViewById(R.id.NavigationView_Comp)

        navController = findNavController(R.id.fragmentContainerView)
        appBarConfiguration = AppBarConfiguration(setOf(R.id.Home_Fragment_1,R.id.Profile_Fragment_1,R.id.Service_Fragment_1,R.id.About_Fragment_1,R.id.Settings_Fragment_1))
        setupActionBarWithNavController(navController, drawerLayout)
        navigationView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragmentContainerView)
        return navController.navigateUp(appBarConfiguration) ||super.onSupportNavigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.Home_Fragment_1 -> {Toast.makeText(applicationContext,"You Clicked Home Fragment",Toast.LENGTH_SHORT).show()}
            R.id.About_Fragment_1 -> {Toast.makeText(applicationContext,"You Clicked Home Fragment",Toast.LENGTH_SHORT).show()}
            R.id.Service_Fragment_1 -> {Toast.makeText(applicationContext,"You Clicked Home Fragment",Toast.LENGTH_SHORT).show()}
            R.id.Profile_Fragment_1 -> {Toast.makeText(applicationContext,"You Clicked Home Fragment",Toast.LENGTH_SHORT).show()}
            R.id.Settings_Fragment_1 -> {Toast.makeText(applicationContext,"You Clicked Home Fragment",Toast.LENGTH_SHORT).show()}

        }
        return super.onOptionsItemSelected(item)
    }
}