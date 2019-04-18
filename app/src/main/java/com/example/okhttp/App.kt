package com.example.okhttp

import android.app.Application
import com.androidx.okhttp.client.ApiManager
import com.androidx.okhttp.manager.StethoNetworkManager
import kotlin.properties.Delegates

class App:Application(),StethoNetworkManager {
    companion object{
        var apiService:ApiService by Delegates.notNull()
        private const val API_URL = ""
    }
    override fun onCreate() {
        super.onCreate()
        init(this)
        ApiManager(ApiService::class.java,API_URL).apply {
            App.apiService = this.apiService
        }
    }
}