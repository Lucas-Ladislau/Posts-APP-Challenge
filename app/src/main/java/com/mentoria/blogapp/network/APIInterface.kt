package com.mentoria.blogapp.network

import com.mentoria.blogapp.model.Comment
import com.mentoria.blogapp.model.Post
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIInterface {

    @GET("posts")
    suspend fun getPosts(): Response<List<Post>>

    @GET("posts/{id}")
    suspend fun getPost(@Path("id") id:String): Response<Post>

    @GET("comments")
    suspend fun getComments(@Query("postId") postId: String): Response<List<Comment>>
}