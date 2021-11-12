package com.sksingh.stockchecker.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BestMatch {
    @SerializedName("1. symbol")
    @Expose
    private var _symbol: String? = null

    @SerializedName("2. name")
    @Expose
    private var _name: String? = null

    @SerializedName("3. type")
    @Expose
    private var _type: String? = null

    @SerializedName("4. region")
    @Expose
    private var _region: String? = null

    @SerializedName("5. marketOpen")
    @Expose
    private var _marketOpen: String? = null

    @SerializedName("6. marketClose")
    @Expose
    private var _marketClose: String? = null

    @SerializedName("7. timezone")
    @Expose
    private var _timezone: String? = null

    @SerializedName("8. currency")
    @Expose
    private var _currency: String? = null

    @SerializedName("9. matchScore")
    @Expose
    private var _matchScore: String? = null
    fun getSymbol(): String? {
        return _symbol
    }

    fun setSymbol(_1Symbol: String?) {
        this._symbol = _1Symbol
    }

    fun getName(): String? {
        return _name
    }

    fun setName(_2Name: String?) {
        this._name = _2Name
    }

    fun getType(): String? {
        return _type
    }

    fun setType(_3Type: String?) {
        this._type = _3Type
    }

    fun getRegion(): String? {
        return _region
    }

    fun setRegion(_4Region: String?) {
        this._region = _4Region
    }

    fun getMarketOpen(): String? {
        return _marketOpen
    }

    fun setMarketOpen(_5MarketOpen: String?) {
        this._marketOpen = _5MarketOpen
    }

    fun getMarketClose(): String? {
        return _marketClose
    }

    fun setMarketClose(_6MarketClose: String?) {
        this._marketClose = _6MarketClose
    }

    fun getTimezone(): String? {
        return _timezone
    }

    fun setTimezone(_7Timezone: String?) {
        this._timezone = _7Timezone
    }

    fun getCurrency(): String? {
        return _currency
    }

    fun setCurrency(_8Currency: String?) {
        this._currency = _8Currency
    }

    fun getMatchScore(): String? {
        return _matchScore
    }

    fun setMatchScore(_9MatchScore: String?) {
        this._matchScore = _9MatchScore
    }
}