package com.sumin.readroad.presentation.review

import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import com.sumin.readroad.R
import com.sumin.readroad.databinding.ActivityReviewDetailBinding
import com.sumin.readroad.util.binding.BindingActivity
import com.sumin.readroad.util.extension.showSnackbar

class ReviewDetailActivity :
    BindingActivity<ActivityReviewDetailBinding>(R.layout.activity_review_detail) {

    override fun constructLayout() {
        binding.tvDetailContent.customSelectionActionModeCallback = disableMenu
    }

    override fun addListeners() {
        binding.btnDetailScrap.setOnClickListener {
            val content = binding.tvDetailContent
            val selection =
                binding.tvDetailContent.text.toString()
                    .substring(content.selectionStart, content.selectionEnd).trim()
            it.showSnackbar(selection)
        }
    }

    private val disableMenu = object : ActionMode.Callback {
        override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean {
            binding.btnDetailScrap.isEnabled = true
            return true
        }

        override fun onPrepareActionMode(mode: ActionMode?, menu: Menu): Boolean {
            menu.clear()
            return true
        }

        override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {
            return true
        }

        override fun onDestroyActionMode(mode: ActionMode?) {
            binding.btnDetailScrap.isEnabled = false
        }
    }
}