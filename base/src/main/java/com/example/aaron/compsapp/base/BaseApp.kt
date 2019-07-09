package com.example.aaron.compsapp.base

import android.app.Application

/**
 * Created by jph on 2019-07-08.
 */
abstract class BaseApp : Application() {
    abstract fun initModule(app: Application)

    override fun onCreate() {
        super.onCreate()
        this.initModule(this)
    }
}