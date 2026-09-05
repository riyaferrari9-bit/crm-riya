package com.riyasolution.riyasolutionapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import com.riyasolution.riyasolutionapp.databinding.ActivityQuickQuoteBinding
import com.riyasolution.riyasolutionapp.db.QuoteDatabase
import com.riyasolution.riyasolutionapp.db.QuoteEntity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class QuickQuoteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuickQuoteBinding
    private lateinit var db: QuoteDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuickQuoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = QuoteDatabase.getDatabase(this)

        binding.btnSaveAndSendQuote.setOnClickListener {
            val name = binding.etClientNameQuote.text.toString()
            val totalStr = binding.tvGrandTotal.text.toString()
            val total = totalStr.replace("[^\\d.]".toRegex(), "").toDoubleOrNull() ?: 0.0

            lifecycleScope.launch(Dispatchers.IO) {
                val date = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US).format(Date())
                val quote = QuoteEntity(
                    clientName = name,
                    date = date,
                    totalAmount = total,
                    quoteDetails = "Cotización Generada"
                )
                db.quoteDao().insertQuote(quote)

                withContext(Dispatchers.Main) {
                    finish()
                }
            }
        }
    }
}
