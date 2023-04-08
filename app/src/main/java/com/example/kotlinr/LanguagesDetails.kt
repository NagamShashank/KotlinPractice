package com.example.kotlinr

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinr.databinding.ActivityLanguagesDetailsBinding

class LanguagesDetails : AppCompatActivity() {

    private lateinit var binding: ActivityLanguagesDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLanguagesDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Intent intent = getIntent();
        val name = intent.getStringExtra("LanguageName")
        val Picture = intent.getIntExtra("LanguagePicture",0)

        binding.LanguageName.text = name
        binding.Lpicture.setImageResource(Picture)

    }
}