package com.riyasolution.riyasolutionapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.riyasolution.riyasolutionapp.databinding.ActivityPreDesignedAdminBinding

class PreDesignedAdminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreDesignedAdminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreDesignedAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
