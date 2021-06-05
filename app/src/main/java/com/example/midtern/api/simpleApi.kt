package com.example.midtern.api

import com.example.midtern.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface simpleApi {
    @GET("posts")
    suspend fun getPost(): Response<Post>
}