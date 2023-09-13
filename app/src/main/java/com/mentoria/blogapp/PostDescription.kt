package com.mentoria.blogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mentoria.blogapp.databinding.ActivityMainBinding
import com.mentoria.blogapp.databinding.ActivityPostDescriptionBinding

class PostDescription : AppCompatActivity() {

    private lateinit var binding: ActivityPostDescriptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_description)

        val id = intent.extras
        val idPost = id?.getString("id")

        binding.postTitle.text = idPost.toString()

    }
}