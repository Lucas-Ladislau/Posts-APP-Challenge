package com.mentoria.blogapp.viewModel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mentoria.blogapp.databinding.FragmentCardPostBinding
import com.mentoria.blogapp.model.Post

class PostAdapter(
    private val posts : List<Post>
) : RecyclerView.Adapter<PostViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = FragmentCardPostBinding.inflate(from, parent, false)
        return PostViewHolder(parent.context, binding)
    }

    override fun getItemCount(): Int = posts.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bindPostItem(posts[position])
    }
}