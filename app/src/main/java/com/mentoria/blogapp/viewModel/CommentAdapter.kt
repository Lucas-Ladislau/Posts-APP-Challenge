package com.mentoria.blogapp.viewModel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mentoria.blogapp.databinding.FragmentCommentBinding
import com.mentoria.blogapp.model.Comment

class CommentAdapter(
    private val comments : List<Comment>
) : RecyclerView.Adapter<CommentHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = FragmentCommentBinding.inflate(from, parent, false)
        return CommentHolder(parent.context, binding)
    }

    override fun getItemCount(): Int = comments.size

    override fun onBindViewHolder(holder: CommentHolder, position: Int) {
        holder.bindCommentItem(comments[position])
    }

}