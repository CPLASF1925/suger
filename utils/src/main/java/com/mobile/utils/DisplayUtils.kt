package com.mobile.utils

import android.content.Context
import android.util.DisplayMetrics
import com.mobile.utils.Utils.Companion.app

/**
 * Created by jimji on 2017/9/16.
 */
fun dp2px(dp: Number) = (dp.toFloat() * app.resources.displayMetrics.density + 0.5f).toInt()

fun sp2px(sp: Number) = (sp.toFloat() * app.resources.displayMetrics.scaledDensity + 0.5f).toInt()

fun px2dp(px: Number) = (px.toFloat() / app.resources.displayMetrics.density + 0.5f).toInt()

fun px2sp(px: Number) = (px.toFloat() / app.resources.displayMetrics.scaledDensity + 0.5f).toInt()

val Context.metrics: DisplayMetrics
    get() {
        val result = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(result)
        return result
    }