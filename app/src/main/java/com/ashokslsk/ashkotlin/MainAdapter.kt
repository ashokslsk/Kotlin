package com.ashokslsk.ashkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.ashokslsk.ashkotlin.models.photo
import com.bumptech.glide.Glide
import org.w3c.dom.Text

/**
 * Created by ashok.kumar on 26/08/17.
 */
class MainAdapter(var photos:List<photo>,
                  var clickListener : View.OnClickListener) : RecyclerView.Adapter<MainAdapter.PhotoViewHolder>() {




    override fun onBindViewHolder(holder: PhotoViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val photo = photos[position]
        holder?.tags?.text = photo.tags
        holder?.likes?.text = photo.likes.toString()
        holder?.favorites?.text = photo.favorites.toString()
        if (photo.PreviewURL.isNotEmpty()){
            Glide.with(holder?.tags?.context)
                    .load(photo.PreviewURL)
                    .into(holder?. photo_item)
        }

    }


    fun getPhoto(adapaterPosition : Int): photo{
        return photos[adapaterPosition]
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return photos.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PhotoViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    return PhotoViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.photo_item, parent, false))

    }


    inner class PhotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tags : TextView
            var likes : TextView
            var favorites : TextView
            var photo_item : ImageView

        init {
            if (clickListener != null){
                itemView.setOnClickListener(clickListener)
            }
            itemView.tag = this
            tags = itemView.findViewById(R.id.tags) as TextView
            likes = itemView.findViewById(R.id.likes) as TextView
            favorites = itemView.findViewById(R.id.favorite_label) as TextView
            photo_item = itemView.findViewById(R.id.photo_item) as ImageView
        }

    }

}