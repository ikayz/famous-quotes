package com.ikayz.kotlin.famousquotes.data

import com.ikayz.kotlin.famousquotes.R
import com.ikayz.kotlin.famousquotes.model.Quotes

class Datasource {
    fun loadQuotes(): List<Quotes> {
        return listOf<Quotes>(
            Quotes(R.string.quote_1, R.drawable.mother_teresa),
            Quotes(R.string.quote_2, R.drawable.franklin_d_roosevelt),
            Quotes(R.string.quote_3, R.drawable.margaret_mead),
            Quotes(R.string.quote_4, R.drawable.robert_louis_stevenson),
            Quotes(R.string.quote_5, R.drawable.eleanorroosevelt),
            Quotes(R.string.quote_6, R.drawable.franklin_hero),
            Quotes(R.string.quote_7, R.drawable.helen_keller),
            Quotes(R.string.quote_8, R.drawable.aristotle),
            Quotes(R.string.quote_9, R.drawable.anne_frank),
            Quotes(R.string.quote_10, R.drawable.ralph_waldo_emerson)
        )
    }
}