package com.riyasolution.riyasolutionapp.api
import com.google.gson.annotations.SerializedName
data class MessageRequest(
    val messagingProduct: String,
    @SerializedName("to") val to: String,
    val type: String,
    val document: DocumentObject
)
