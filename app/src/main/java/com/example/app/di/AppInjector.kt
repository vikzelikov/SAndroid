package com.example.app.di

import android.app.Application
import com.example.core.di.CoreInjector

object AppInjector {

    fun initialise(application: Application) {
        initialiseCore(application)
    }

    private fun initialiseCore(application: Application) {
        CoreInjector.initialise(application)
    }

}