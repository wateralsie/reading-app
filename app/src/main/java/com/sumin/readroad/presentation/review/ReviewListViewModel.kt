package com.sumin.readroad.presentation.review

import androidx.lifecycle.ViewModel
import com.sumin.readroad.data.model.mock.User

class ReviewListViewModel: ViewModel() {
    val mockUser = User(
        name = "Sumin",
        email = "tnals08019@gmail.com"
    )
}