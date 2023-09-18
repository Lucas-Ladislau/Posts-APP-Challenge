package com.mentoria.blogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mentoria.blogapp.databinding.ActivityMainBinding
import com.mentoria.blogapp.viewModel.PostAdapter
import com.mentoria.blogapp.viewModel.PostViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var postViewModel: PostViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shimmerView.startShimmer()

        postViewModel = ViewModelProvider(this).get(PostViewModel::class.java)

        postViewModel.getPosts()
        setRecyclerView()
    }

    private fun setRecyclerView() {
        postViewModel.postsLiveData.observe(this){
            binding.postsRecyclerView.apply {
                layoutManager = LinearLayoutManager(applicationContext)
                adapter = PostAdapter(it)
            }
        binding.shimmerView.stopShimmer()
        binding.shimmerView.hideShimmer()
        binding.shimmerView.isVisible = false
        }
    }
}