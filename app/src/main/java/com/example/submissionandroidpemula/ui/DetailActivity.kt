package com.example.submissionandroidpemula.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.submissionandroidpemula.R

class DetailActivity : AppCompatActivity() {

    private var game: String? = null
    private var genre: String? = null
    private var image: Int? = null
    private var release: String? = null
    private var detail: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        getIntent(intent)
    }

    private fun getIntent(intent: Intent){
        game = intent.getStringExtra("NAME").toString()
        image = intent.getIntExtra("IMAGE", 0)
        genre = intent.getStringExtra("GENRE").toString()
        release = intent.getStringExtra("RELEASE").toString()
        detail = intent.getStringExtra("DETAIL").toString()
        binding()
    }

    private fun binding(){
        val tvName = findViewById<TextView>(R.id.tv_game)
        tvName.text = game
        val ivImage = findViewById<ImageView>(R.id.iv_game)
        image?.let { ivImage.setImageResource(it) }
        val tvGenre = findViewById<TextView>(R.id.tv_genre)
        tvGenre.text = genre
        val tvRelease = findViewById<TextView>(R.id.tv_release)
        tvRelease.text = release
        val tvDetail = findViewById<TextView>(R.id.tv_description_detail)
        tvDetail.text = detail
    }
}