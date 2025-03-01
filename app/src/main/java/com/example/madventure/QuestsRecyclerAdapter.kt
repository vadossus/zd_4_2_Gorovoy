package com.example.madventure

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuestRecycler(private val context: Context, private val list: ArrayList<Quests>) : RecyclerView.Adapter<QuestRecycler.MyVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.item_recycler_view, parent, false)
        return MyVH(root)
    }

    inner class MyVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.questsImageView)
        val title: TextView = itemView.findViewById(R.id.titleQuestsTextView)
        val description: TextView = itemView.findViewById(R.id.descriptionTextView)
    }

    override fun onBindViewHolder(holder: MyVH, position: Int) {
        list[position].apply {
            holder.imageView.setImageResource(image)
            holder.title.text = title
            holder.description.text = text
        }
    }

    override fun getItemCount(): Int = list.size
}