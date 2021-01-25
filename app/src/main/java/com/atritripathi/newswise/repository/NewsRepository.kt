package com.atritripathi.newswise.repository

import com.atritripathi.newswise.network.RetrofitInstance
import com.atritripathi.newswise.db.ArticleDatabase
import com.atritripathi.newswise.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsertArticle(article: Article) = db.articleDao().upsertArticle(article)

    fun getAllArticles() = db.articleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.articleDao().deleteArticle(article)
}