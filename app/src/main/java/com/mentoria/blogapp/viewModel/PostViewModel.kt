package com.mentoria.blogapp.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mentoria.blogapp.model.Comment
import com.mentoria.blogapp.model.Post
import com.mentoria.blogapp.network.APIClient
import com.mentoria.blogapp.network.APIInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    private val apiInterface = APIClient.getRetrofitInstance("https://jsonplaceholder.typicode.com/")
    var endpoint = apiInterface.create(APIInterface::class.java)
    var postsLiveData = MutableLiveData<List<Post>>()
    var post = MutableLiveData<Post>()
    var commentsLiveData = MutableLiveData<List<Comment>>()


     fun getPosts(){
         GlobalScope.launch(Dispatchers.Main) {
            val response = endpoint.getPosts()
            if (response.isSuccessful) {
                val posts = response.body()
                postsLiveData.postValue(posts)
            } else {
                Log.i("Tesx", "Deu BO")
            }
        }
    }

    fun getPost(id: String){
        GlobalScope.launch(Dispatchers.Main) {
            val response = endpoint.getPost(id)
            if (response.isSuccessful) {
                val postBody = response.body()
                post.postValue(postBody)
            } else {
                Log.i("Tesx", "Deu BO")
            }
        }
    }

    fun getComments(id: String){
        GlobalScope.launch(Dispatchers.Main) {
            val response = endpoint.getComments(id)
            if (response.isSuccessful) {
                val commentsBody = response.body()
                commentsLiveData.postValue(commentsBody)
            } else {
                Log.i("Tesx", "Deu BO")
            }
        }
    }
}