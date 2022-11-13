package com.zasa.yttodo.utils

import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.DateFormat

/**
 * Created by Sangeeth Amirthanathan
 * on 11/13/2022.
 */

@BindingAdapter("setPriority")
fun setPriority(view: TextView, priority: Int) {
    when (priority) {
        0 -> {
            view.text = "High Priority"
            view.setTextColor(Color.RED)
        }

        1 -> {
            view.text = "Medium Priority"
            view.setTextColor(Color.BLUE)
        }

        else -> {
            view.text = "Low Priority"
            view.setTextColor(Color.GREEN)
        }
    }
}

@BindingAdapter("setTimeStamp")
fun setTimeStamp(view: TextView, timeStamp : Long){
    view.text = DateFormat.getInstance().format(timeStamp)
}