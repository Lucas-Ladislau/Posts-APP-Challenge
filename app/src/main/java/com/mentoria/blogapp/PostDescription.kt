package com.mentoria.blogapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mentoria.blogapp.databinding.ActivityMainBinding
import com.mentoria.blogapp.databinding.ActivityPostDescriptionBinding
import com.mentoria.blogapp.viewModel.CommentAdapter
import com.mentoria.blogapp.viewModel.PostAdapter
import com.mentoria.blogapp.viewModel.PostViewModel

class PostDescription : AppCompatActivity() {

    private lateinit var binding: ActivityPostDescriptionBinding
    private lateinit var postViewModel: PostViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        postViewModel = ViewModelProvider(this).get(PostViewModel::class.java)

        val data = intent.extras
        val idPost = data?.getString("id")
        val titlePost = data?.getString("title")
        val bodyPost = data?.getString("body")

        binding.postTitleContent.text = titlePost
        binding.description.text = bodyPost

        if(idPost != null) {
            postViewModel.getComments(idPost)
        }
        setCommentsRecyclerView()

        binding.voltar.setOnClickListener(){
            val home = Intent(this, MainActivity::class.java)
            startActivity(home)
        }
    }

    private fun setCommentsRecyclerView() {
        postViewModel.commentsLiveData.observe(this){
            binding.commentsRecyclerView.apply {
                layoutManager = LinearLayoutManager(applicationContext)
                adapter = CommentAdapter(it)
            }
        }
    }
}