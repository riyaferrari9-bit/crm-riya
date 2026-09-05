package com.riyasolution.riyasolutionapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.riyasolution.riyasolutionapp.databinding.ActivityCorporateInfoBinding

class CorporateInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCorporateInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCorporateInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener { finish() }
    }
}
