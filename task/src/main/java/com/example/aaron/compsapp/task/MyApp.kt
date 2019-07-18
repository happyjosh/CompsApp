package com.example.aaron.compsapp.task

import android.app.Application
import com.example.aaron.compsapp.base.BaseApp
import com.example.aaron.compsapp.task.di.AppModule
import com.example.aaron.compsapp.task.di.DaggerTaskAppComponent


/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp() {

    private val module = MyModule();

    override fun initModule(app: Application) {
        module.initModule(app)
        DaggerTaskAppComponent.builder()
            .appModule(AppModule(this))
            .build()
            .inject(this)
    }
}