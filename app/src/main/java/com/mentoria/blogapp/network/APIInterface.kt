package com.mentoria.blogapp.network

import com.mentoria.blogapp.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface APIInterface {

    @GET("/posts")
    fun getPosts(): Response<List<Post>>
}