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

//        O que é melhor passar a informação pela activity ou
//        consumir a api novamente porém diretamente para o id do post "post/1"
        binding.postCardContent.setOnClickListener(){
            val postDescription = Intent(context, PostDescription::class.java)
            postDescription.putExtra("id", postItem.id)
            postDescription.putExtra("title", postItem.title)
            postDescription.putExtra("body", postItem.body)
            context.startActivity(postDescription)
        }
    }
}