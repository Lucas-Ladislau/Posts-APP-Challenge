package com.mentoria.blogapp.model

import com.google.gson.annotations.SerializedName

data class Comment(
    @SerializedName("id")
    val id: String,
    @SerializedName("postId")
    val postId: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("body")
    val body: String
)