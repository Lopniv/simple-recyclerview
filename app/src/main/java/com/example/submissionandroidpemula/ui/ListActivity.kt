package com.example.submissionandroidpemula.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.submissionandroidpemula.R
import com.example.submissionandroidpemula.adapter.GameAdapter
import com.example.submissionandroidpemula.data.Game
import com.example.submissionandroidpemula.data.GamesData

class ListActivity : AppCompatActivity() {

    private lateinit var rvGame: RecyclerView
    private var list: ArrayList<Game> = arrayListOf()
    private var filterList: List<Game> = listOf()
    private var genre: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        genre = intent.getStringExtra("GENRE").toString()

        rvGame = findViewById(R.id.rv_list_game)
        rvGame.setHasFixedSize(true)

        list.addAll(GamesData.listData)
        when(genre){
            "All" -> filterList = list
            "Action" -> filterList = list.filter { it.genre.contains("Action") }
            "Adventure" -> filterList = list.filter { it.genre.contains("Adventure") }
            "Racing" -> filterList = list.filter { it.genre.contains("Racing") }
            "RPG" -> filterList = list.filter { it.genre.contains("RPG") }
            "Sport" -> filterList = list.filter { it.genre.contains("Sport") }
            "Strategy" -> filterList = list.filter { it.genre.contains("Strategy") }
        }

        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvGame.layoutManager = LinearLayoutManager(this)
        val listGameAdapter = GameAdapter(filterList)
        rvGame.adapter = listGameAdapter

        listGameAdapter.setOnItemClickCallback(object : GameAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Game) {
                showDetail(data)
            }
        })
    }

    fun showDetail(data: Game){
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("NAME", data.gameName)
        intent.putExtra("IMAGE", data.image)
        intent.putExtra("GENRE", data.genre)
        intent.putExtra("RELEASE", data.releaseDate)
        intent.putExtra("DETAIL", data.detail)
        startActivity(intent)
    }
}