package com.example.viewpager2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class ViewPagerFragment : Fragment() {
    private var check = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val picture_namePagerTV: TextView = view.findViewById(R.id.picture_namePagerTV)
        val autor_namePagerTV: TextView = view.findViewById(R.id.autor_namePagerTV)
        val imagePagerIV: ImageView = view.findViewById(R.id.imagePagerIV)
        val startBTN: Button = view.findViewById(R.id.startBTN)
        val viewpagerItem = arguments?.getSerializable("vp") as ViewPagerModel
        check = viewpagerItem.checkButton!!

        picture_namePagerTV.text = viewpagerItem.picture_name
        autor_namePagerTV.text = viewpagerItem.author_name
        imagePagerIV.setImageResource(viewpagerItem.imageView)

        if (!check)
            startBTN.visibility = View.VISIBLE
        startBTN.setOnClickListener {
            startActivity(Intent(activity, StartActivity::class.java))
        }

    }}