package com.xqy.androidx.retrofit.manager

import android.app.Application
import com.facebook.stetho.Stetho

interface StethoNetworkManager {

    fun init(application: Application){
        Stetho.initializeWithDefaults(application)
    }
}