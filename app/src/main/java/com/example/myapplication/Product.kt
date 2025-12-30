package com.example.myapplication

import com.google.gson.annotations.SerializedName

data class Product(
    val id: Int,
    val title: String,
    val price: Double,
    val description: String,
    val category: String,
    val image: String,
    @SerializedName("rating") val rating: Rating
)

data class Rating(
    val rate: Double,
    val count: Int
)