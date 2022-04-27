package com.example.recyclerviewfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf(
        "Ac Milan",
        "Arsenal FC",
        "Barcelona",
        "Bayern FC",
        "ManUnited",
        "Real Madrid CF",
        "Juventus",
        "Dortmund FC"
    )

    private var details = arrayOf(
        "Star Player: Zlatan",
        "2004 Invincible",
        "Home of La Masia",
        "Allianz Arena",
        "Best Player: Ronaldo",
        "Champions League x13",
        "League Titles x36",
        "Home of young talents")

    private var images = intArrayOf(
        R.drawable.acmilan,
        R.drawable.arsenal,
        R.drawable.barcelona,
        R.drawable.bayern,
        R.drawable.manutd,
        R.drawable.realmadrid,
        R.drawable.juventus,
        R.drawable.dortmund
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])

    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_Image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }

    }
}