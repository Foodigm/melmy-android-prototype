package com.melmy.melmyprototype

import android.app.Application
import android.util.Log
import com.facebook.stetho.Stetho

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}