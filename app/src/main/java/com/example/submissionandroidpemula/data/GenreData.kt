package com.example.submissionandroidpemula.data

import com.example.submissionandroidpemula.R

object GenreData {
    private val genreName = arrayOf(
        "All",
        "Action",
        "Adventure",
        "Racing",
        "RPG",
        "Sport",
        "Strategy"
    )

    private val genreIcon = intArrayOf(
        R.drawable.all,
        R.drawable.action,
        R.drawable.adventure,
        R.drawable.racing,
        R.drawable.rpg,
        R.drawable.sport,
        R.drawable.strategy
    )

    private val colorBg = intArrayOf(
        R.color.white,
        R.color.cyan_pallete,
        R.color.red_pallete,
        R.color.yellow_pallete,
        R.color.blue_pallete,
        R.color.green_pallete,
        R.color.purple_pallete
    )

    val listData: ArrayList<Genre>
        get() {
            val list = arrayListOf<Genre>()
            for (position in genreName.indices) {
                val genre = Genre()
                genre.genreName = genreName[position]
                genre.icon = genreIcon[position]
                genre.colorBg = colorBg[position]
                list.add(genre)
            }
            return list
        }
}