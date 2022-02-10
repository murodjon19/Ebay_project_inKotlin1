package com.example.ebay_project_inkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_project_inkotlin.adapter.FavoriteAdapter
import com.example.ebay_project_inkotlin.madel.Favorite

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = manager

        refreshAdapter(getFavourites())
    }

    fun refreshAdapter(items:ArrayList<Favorite>) {
        val adapter = FavoriteAdapter(this,items)
        recyclerView!!.adapter = adapter
    }

    fun getFavourites(): ArrayList<Favorite> {
        val items: ArrayList<Favorite> = ArrayList()
        items.add(Favorite("AppleWatch",R.drawable.img31))
        items.add(Favorite("AppleWatch",R.drawable.img32))
        items.add(Favorite("AppleWatch",R.drawable.img33))
        items.add(Favorite("AppleWatch",R.drawable.img34))
        items.add(Favorite("AppleWatch",R.drawable.img35))
        items.add(Favorite("AppleWatch",R.drawable.img36))
        items.add(Favorite("AppleWatch",R.drawable.img37))
        items.add(Favorite("AppleWatch",R.drawable.img38))
        items.add(Favorite("AppleWatch",R.drawable.img39))
        items.add(Favorite("AppleWatch",R.drawable.img40))
        items.add(Favorite("AppleWatch",R.drawable.img31))

        return items
    }
}