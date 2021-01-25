package com.atritripathi.newswise.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.atritripathi.newswise.R
import com.atritripathi.newswise.ui.NewsActivity
import com.atritripathi.newswise.ui.viewmodels.NewsViewModel

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}