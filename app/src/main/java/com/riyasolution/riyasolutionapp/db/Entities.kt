package com.riyasolution.riyasolutionapp.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quotes")
data class QuoteEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val clientName: String,
    val date: String,
    val totalAmount: Double,
    val quoteDetails: String
)

@Entity(tableName = "clients")
data class ClientEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val company: String,
    val phone: String,
    val email: String,
    val position: String,
    val lastUpdated: Long = System.currentTimeMillis()
)

@Entity(tableName = "solutions")
data class SolutionEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val details: String,
    val category: String,
    val pdfUri: String
)
