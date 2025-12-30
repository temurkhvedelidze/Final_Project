package com.example.myapplication

import retrofit2.Response

class ProductRepository(private val apiService: ProductApiService) {
    suspend fun getProducts(): Response<List<Product>> {
        return apiService.getProducts()
    }
}