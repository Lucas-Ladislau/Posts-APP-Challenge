package com.mentoria.blogapp.viewModel

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.mentoria.blogapp.PostDescription
import com.mentoria.blogapp.databinding.FragmentCardPostBinding
import com.mentoria.blogapp.model.Post

class PostViewHolder(
    private val context: Context,
    private val binding: FragmentCardPostBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bindPostItem(postItem: Post){
        binding.postTitle.text = postItem.title
        binding.description.text = postItem.body

        binding.postCardContent.setOnClickListener(){
            val postDescription = Intent(context, PostDescription::class.java)
            postDescription.putExtra("id", postItem.id)
            context.startActivity(postDescription)
        }
    }
}