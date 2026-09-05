package com.riyasolution.riyasolutionapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.riyasolution.riyasolutionapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnQuickQuote.setOnClickListener {
            startActivity(Intent(this, QuickQuoteActivity::class.java))
        }

        binding.btnQuoteHistory.setOnClickListener {
            startActivity(Intent(this, QuoteHistoryActivity::class.java))
        }

        binding.btnPreDesigned.setOnClickListener {
            startActivity(Intent(this, PreDesignedQuotesActivity::class.java))
        }

        binding.logo.setOnClickListener {
            startActivity(Intent(this, AdminActivity::class.java))
        }

        binding.btnCorporateInfo.setOnClickListener {
            startActivity(Intent(this, CorporateInfoActivity::class.java))
        }
    }
}
