package com.sksingh.stockchecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class StockWatcherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Watchlisted stocks"
        setContentView(R.layout.activity_main)

        var fbBtn = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fbBtn.setOnClickListener {
            var intent = Intent(this@StockWatcherActivity, SearchAndSelectStockActivity::class.java)
            startActivity(intent)
        }
    }

}