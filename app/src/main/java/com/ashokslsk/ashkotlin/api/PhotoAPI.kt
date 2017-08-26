package com.ashokslsk.ashkotlin.api

import com.ashokslsk.ashkotlin.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 *
 */
interface PhotoAPI {
    @GET("?key=6278461-a19b9cd6391964f2c781b7b05&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}