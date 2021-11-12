package com.sksingh.stockchecker

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Search and Select activity
 */

class SearchAndSelectStockActivity : AppCompatActivity() {

    private var queryTextChangedJob: Job? = null
    private lateinit var searchText: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Select stock to watch"
        setContentView(R.layout.activity_search_select)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        // Associate searchable configuration with the SearchView
        (menu.findItem(R.id.action_search).actionView as SearchView).apply {
            setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    TODO("Not yet implemented")
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    val text = newText ?: return false
                    searchText = text
                    queryTextChangedJob?.cancel()
                    queryTextChangedJob = lifecycleScope.launch(Dispatchers.Main) {
                        println("async work started...")
                        delay(100)
                        launch(Dispatchers.IO) {
//                            doSearch(searchText)
                        }
                        println("async work done!")
                    }
                    return true;
                }

            })
        }

        return true
    }

    fun doSearch(searchText: String) {

    }
}