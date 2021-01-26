package com.atritripathi.newswise.models

import com.atritripathi.newswise.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)