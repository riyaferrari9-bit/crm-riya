package com.riyasolution.riyasolutionapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.riyasolution.riyasolutionapp.databinding.ActivityPreDesignedQuotesBinding

class PreDesignedQuotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreDesignedQuotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreDesignedQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
