package com.example.submissionandroidpemula.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissionandroidpemula.R
import com.example.submissionandroidpemula.data.Game

class GameAdapter(private val listGame: List<Game>) : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGame.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context)
            .load(game.image)
            .apply(RequestOptions().override(80,100))
            .into(holder.imageGame)

        holder.tvGame.text = game.gameName
        holder.tvGenre.text = game.genre
        holder.tvRelease.text = game.releaseDate
        holder.tvDesc.text = game.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listGame[holder.adapterPosition])
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvGame: TextView = itemView.findViewById(R.id.tv_game)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_genre)
        var tvRelease: TextView = itemView.findViewById(R.id.tv_release)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_description)
        var imageGame: ImageView = itemView.findViewById(R.id.iv_game)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Game)
    }
}