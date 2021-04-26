package com.example.app

import android.app.Application
import com.example.app.di.AppInjector

open class App: Application() {

    override fun onCreate() {
        super.onCreate()

        initialiseDagger()
    }


    private fun initialiseDagger() {
        AppInjector.initialise(this)
    }

}