package com.ashokslsk.ashkotlin.models

import java.io.Serializable

/**
 * Created by ashok.kumar on 26/08/17.
 */
data class photo(val id: String,
                 val likes: Int,
                 val favorites: Int,
                 val tags : String,
                 val PreviewURL: String,
                 val webFormatURL: String) :Serializable {

}