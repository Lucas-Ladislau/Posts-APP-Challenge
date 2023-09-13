package com.mentoria.blogapp.viewModel

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.mentoria.blogapp.PostDescription
import com.mentoria.blogapp.databinding.FragmentCardPostBinding
import com.mentoria.blogapp.databinding.FragmentCommentBinding
import com.mentoria.blogapp.model.Comment
import com.mentoria.blogapp.model.Post

class CommentHolder(
    private val context: Context,
    private val binding: FragmentCommentBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bindCommentItem(commentItem: Comment){
        binding.username.text = commentItem.name
        binding.email.text = commentItem.email
        binding.comment.text = commentItem.body

    }
}