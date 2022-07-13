package com.example.tbcrevision3

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tbcrevision3.databinding.LayouySrctionBinding

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(var binding: LayouySrctionBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayouySrctionBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = sectionList[position]
        holder.binding.apply {

            imageView.setImageResource(currentItem.image)
            TextViewSection.text = currentItem.title
            if(holder.adapterPosition== sectionList.lastIndex){
                imageView.setColorFilter(Color.RED)
                TextViewSection.setTextColor(Color.RED)
            }
        }
    }

    override fun getItemCount(): Int = sectionList.size
}