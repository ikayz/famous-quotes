package com.ikayz.kotlin.famousquotes.data

import com.ikayz.kotlin.famousquotes.model.Quotes

class Datasource {
    fun loadQuotes(): List<Quotes> {
        return listOf<Quotes>(
            Quotes()
        )
    }
}