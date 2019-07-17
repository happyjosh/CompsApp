package com.example.aaron.compsapp

import android.app.Application
import com.example.aaron.compsapp.base.BaseApp
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return null
    }

    private val module = MyModule();

    override fun initModule(app: Application) {
        module.initModule(app)
    }
}