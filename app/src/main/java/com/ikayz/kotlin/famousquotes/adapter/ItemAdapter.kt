package com.ikayz.kotlin.famousquotes.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.ikayz.kotlin.famousquotes.model.Quotes

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Quotes>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
}