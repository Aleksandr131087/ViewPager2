package com.example.viewpager2

import java.io.Serializable

class ViewPagerModel (
    val picture_name: String,
    val author_name: String,
    val imageView: Int

) : Serializable{
    companion object {
val viewPagerList = mutableListOf(
    ViewPagerModel("Утро в сосновом лесу", "И.И. Шишкин", R.drawable.utro),
    ViewPagerModel("Полевая рябинка", "А.А. Рылов", R.drawable.polevaya_rybina),
ViewPagerModel("Девочка с персиками", "В.А. Серов", R.drawable.spersikamy),
    ViewPagerModel("Мона лиза", "Л. Да Винчи", R.drawable.liza),
    ViewPagerModel("9 Вал", "И.K. Айвазовский", R.drawable.val9),
    ViewPagerModel("Последний день Помпеи", "К.П. Брюллов", R.drawable.pompey),
    ViewPagerModel("Демон", "М.А. Врубель", R.drawable.demon),
    ViewPagerModel("Богатыри", "В.А. Васнецов", R.drawable.bogatyr),
    ViewPagerModel("Купание красного коня", "К.С. Петров-Водкин", R.drawable.konya),
    ViewPagerModel("Подсолнухи", "Винсент Ван Гог", R.drawable.podsolnuhi),

    )
    }
}