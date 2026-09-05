package com.riyasolution.riyasolutionapp

data class Partida(
    var description: String = "",
    var amount: Double = 0.0,
    var quantity: Int = 1,
    var category: String = "Otros"
)

data class Quote(
    var id: Int = 0,
    var clientName: String = "",
    var clientPhone: String = "",
    var date: String = "",
    var quoteDetails: String = "",
    var totalAmount: Double = 0.0
)

data class Solution(
    var id: Int = 0,
    var title: String = "",
    var details: String = "",
    var category: String = "General",
    var pdfUrl: String = ""
)
