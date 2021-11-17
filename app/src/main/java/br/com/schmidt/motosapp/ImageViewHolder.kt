package br.com.schmidt.motosapp

import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ImageViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

    fun bind(imgeUrl: String) {
        val imageView = view.findViewById<ImageView>(R.id.image_view)
        Log.d("Adriano","Entrou no holder: $imgeUrl")
        Glide
            .with(view.context)
            .load("https://post.medicalnewstoday.com/wp-content/uploads/sites/3/2020/02/322868_1100-800x825.jpg")
            .centerCrop()
            .into(imageView)
    }

}
