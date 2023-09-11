package com.mentoria.blogapp.viewModel

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.mentoria.blogapp.databinding.FragmentCardPostBinding
import com.mentoria.blogapp.model.Post

class PostViewHolder(
    private val binding: FragmentCardPostBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bindPostItem(postItem: Post){
        binding.postTitle.text = postItem.title
        binding.description.text = postItem.body
    }
}