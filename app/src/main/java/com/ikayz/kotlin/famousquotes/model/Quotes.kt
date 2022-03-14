package com.ikayz.kotlin.famousquotes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quotes(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int) {
}