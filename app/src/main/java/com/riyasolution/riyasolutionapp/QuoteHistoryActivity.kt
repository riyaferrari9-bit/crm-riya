package com.riyasolution.riyasolutionapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.riyasolution.riyasolutionapp.databinding.ActivityQuoteHistoryBinding

class QuoteHistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuoteHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuoteHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
