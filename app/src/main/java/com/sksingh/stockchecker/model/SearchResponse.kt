package com.sksingh.stockchecker.model

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class SearchResponse {
    @SerializedName("bestMatches")
    @Expose
    var bestMatches: List<BestMatch>? = null
}