package com.example.madventure

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QuestsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quests)

        val recycler: RecyclerView = findViewById(R.id.recyclerView)
        recycler.layoutManager = GridLayoutManager(this, 3)
        recycler.adapter = QuestRecycler(this, MyObj().list)
    }
}