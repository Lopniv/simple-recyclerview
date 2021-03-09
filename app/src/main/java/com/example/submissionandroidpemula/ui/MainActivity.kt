package com.example.submissionandroidpemula.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.submissionandroidpemula.R
import com.example.submissionandroidpemula.adapter.ListGenreAdapter
import com.example.submissionandroidpemula.data.Genre
import com.example.submissionandroidpemula.data.GenreData

class MainActivity : AppCompatActivity() {

    private lateinit var rvGenre: RecyclerView
    private var list: ArrayList<Genre> = arrayListOf()

    object Start {
        fun start(context: Context) {
            val intent = Intent(context, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvGenre = findViewById(R.id.rv_genre)
        rvGenre.setHasFixedSize(true)

        list.addAll(GenreData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvGenre.layoutManager = LinearLayoutManager(this)
        val listGenreAdapter = ListGenreAdapter(list)
        rvGenre.adapter = listGenreAdapter

        listGenreAdapter.setOnItemClickCallback(object: ListGenreAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Genre) {
                showGames(data.genreName)
            }
        })
    }

    fun showGames(genre: String){
        val intent = Intent(this, ListActivity::class.java)
        intent.putExtra("GENRE", genre)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.menu_about -> {
                val profile = Intent(this, AboutActivity::class.java)
                startActivity(profile)
            }
        }
    }
}