package com.example.submissionandroidpemula.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissionandroidpemula.R
import com.example.submissionandroidpemula.data.Genre

class ListGenreAdapter(private val listGenre: ArrayList<Genre>) : RecyclerView.Adapter<ListGenreAdapter.ListGenreViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListGenreViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_genre, parent, false)
        return ListGenreViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGenre.size
    }

    override fun onBindViewHolder(holder: ListGenreViewHolder, position: Int) {
        val genre = listGenre[position]

        Glide.with(holder.itemView.context)
            .load(genre.icon)
            .apply(RequestOptions().override(300,300))
            .into(holder.iconGenre)

        holder.tvGenre.text = genre.genreName
        holder.placeholder.setBackgroundResource(genre.colorBg)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listGenre[holder.adapterPosition])
        }
    }

    inner class ListGenreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvGenre: TextView = itemView.findViewById(R.id.tv_genre)
        var iconGenre: ImageView = itemView.findViewById(R.id.iv_genre)
        var placeholder: RelativeLayout = itemView.findViewById(R.id.rl_placeholder)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Genre)
    }
}