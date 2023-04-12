package com.example.kotlinr.OptionsMenu

import android.app.ProgressDialog.show
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.kotlinr.MainActivity
import com.example.kotlinr.R
import com.example.kotlinr.databinding.ActivityOptionsMenuBinding

class Options_Menu : AppCompatActivity() {

   private lateinit var binding : ActivityOptionsMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOptionsMenuBinding .inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_options,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.Home ->{
                intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext,"Clicked on Home",Toast.LENGTH_SHORT).show()
            }

            R.id.Profile ->
            {Toast.makeText(applicationContext,"Clicked on Profile",Toast.LENGTH_SHORT).show()}
            R.id.Services ->
            {Toast.makeText(applicationContext,"Clicked on Services",Toast.LENGTH_SHORT).show()}
            R.id.About ->
            {Toast.makeText(applicationContext,"Clicked on About",Toast.LENGTH_SHORT).show()}
            R.id.Settings ->
            { Toast.makeText(applicationContext,"Clicked on Settings",Toast.LENGTH_SHORT).show()}

        }
        return super.onOptionsItemSelected(item)
    }
}
