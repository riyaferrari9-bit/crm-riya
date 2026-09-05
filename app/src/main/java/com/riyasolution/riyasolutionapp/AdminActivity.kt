package com.riyasolution.riyasolutionapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.riyasolution.riyasolutionapp.databinding.ActivityAdminBinding

class AdminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
