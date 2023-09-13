package com.mentoria.blogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mentoria.blogapp.databinding.ActivityMainBinding
import com.mentoria.blogapp.databinding.ActivityPostDescriptionBinding
import com.mentoria.blogapp.viewModel.PostViewModel

class PostDescription : AppCompatActivity() {

    private lateinit var binding: ActivityPostDescriptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.extras
        val titlePost = id?.getString("title")
        val bodyPost = id?.getString("body")

        binding.postTitleContent.text = titlePost
        binding.description.text = bodyPost


    }
}