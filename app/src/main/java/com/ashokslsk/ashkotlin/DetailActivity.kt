package com.ashokslsk.ashkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.ImageView
import com.ashokslsk.ashkotlin.models.Photo
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val imageView = findViewById(R.id.imageView) as ImageView
        val photo = intent.getSerializableExtra(PHOTO) as Photo?
        photo?.webformatURL.let {
            Glide.with(this).load(photo?.webformatURL)
                    .into(imageView)
        }
        imageView.setOnClickListener { finish() }
    }

    companion object {
        val PHOTO = "PHOTO"
    }
}
