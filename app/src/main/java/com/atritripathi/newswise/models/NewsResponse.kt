package com.atritripathi.newswise.models

import com.atritripathi.newswise.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)