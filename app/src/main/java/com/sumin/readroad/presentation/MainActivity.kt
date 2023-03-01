package com.sumin.readroad.presentation

import android.content.Intent
import com.sumin.readroad.R
import com.sumin.readroad.databinding.ActivityMainBinding
import com.sumin.readroad.presentation.review.ReviewDetailActivity
import com.sumin.readroad.presentation.review.ReviewListActivity
import com.sumin.readroad.util.binding.BindingActivity

class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun addListeners() {
        binding.btnReviewDetail.setOnClickListener {
            val toReviewDetail = Intent(this, ReviewDetailActivity::class.java)
            startActivity(toReviewDetail)
        }
        binding.btnReviewList.setOnClickListener {
            val toReviewList = Intent(this, ReviewListActivity::class.java)
            startActivity(toReviewList)
        }
    }
}
