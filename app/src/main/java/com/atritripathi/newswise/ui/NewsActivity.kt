package com.atritripathi.newswise.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.atritripathi.newswise.R
import com.atritripathi.newswise.db.ArticleDatabase
import com.atritripathi.newswise.repository.NewsRepository
import com.atritripathi.newswise.ui.viewmodels.NewsViewModel
import com.atritripathi.newswise.ui.viewmodels.NewsViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)


        val newsRepository = NewsRepository(ArticleDatabase.getInstance(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)
            .get(NewsViewModel::class.java)
        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())


    }
}