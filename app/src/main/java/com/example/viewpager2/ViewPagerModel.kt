package com.example.viewpager2

import java.io.Serializable

class ViewPagerModel (
    val picture_name: String,
    val author_name: String,
    val imageView: Int,
    var checkButton: Boolean?


) : Serializable{
    companion object {
val viewPagerList = mutableListOf(
    ViewPagerModel("Банк Петрониус", "Самый надежный банк России", R.drawable.utro, true),
    ViewPagerModel("Банк Петрониус", "25 лет вместе с Вами", R.drawable.polevaya_rybina, true),
ViewPagerModel("Банк Петрониус", "Это Правильный Выбор", R.drawable.spersikamy, false),


    )
    }
}