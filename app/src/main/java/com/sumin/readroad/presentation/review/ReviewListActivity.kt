package com.sumin.readroad.presentation.review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.sumin.readroad.R
import com.sumin.readroad.databinding.ActivityReviewListBinding
import com.sumin.readroad.util.binding.BindingActivity

class ReviewListActivity : BindingActivity<ActivityReviewListBinding>(R.layout.activity_review_list) {
    private val viewModel by viewModels<ReviewListViewModel>()

    override fun constructLayout() {
        binding.user = viewModel.mockUser
    }
}