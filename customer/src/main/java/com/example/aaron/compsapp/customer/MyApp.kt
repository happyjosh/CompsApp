package com.example.aaron.compsapp.customer

import android.app.Application
import com.example.aaron.compsapp.base.BaseApp
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val module = MyModule();

    override fun initModule(app: Application) {
        module.initModule(app)
    }
}