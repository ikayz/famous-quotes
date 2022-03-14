package com.ikayz.kotlin.famousquotes.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.ads.mediationtestsuite.viewmodels.ItemViewHolder
import com.ikayz.kotlin.famousquotes.model.Quotes

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Quotes>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: ItemAdapter.ItemViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)
    }
}