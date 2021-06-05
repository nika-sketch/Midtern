package com.example.midtern.Repository

import com.example.midtern.api.RetrofitInstance
import com.example.midtern.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }
}