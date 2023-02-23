package com.sumin.readroad.util.extension

import android.view.View
import com.google.android.material.snackbar.Snackbar

fun View.showSnackbar(
    message: String,
    duration: Int = Snackbar.LENGTH_SHORT,
    ) {
    Snackbar
        .make(this, message, duration)
        .show()
}