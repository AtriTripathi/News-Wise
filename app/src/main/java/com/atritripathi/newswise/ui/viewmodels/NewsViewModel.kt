package com.atritripathi.newswise.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.atritripathi.newswise.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}