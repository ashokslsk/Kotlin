package com.ashokslsk.ashkotlin.api

import com.ashokslsk.ashkotlin.models.PhotoList
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by ashok.kumar on 26/08/17.
 */
class PhotoRetriever {

    private val service: PhotoAPI

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://pixabay.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        service = retrofit.create(PhotoAPI::class.java)
    }

    fun getPhotos(callback : Callback<PhotoList>){
      val call = service.getPhotos();
        call.enqueue(callback)
    }

}