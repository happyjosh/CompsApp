package com.example.aaron.compsapp.setting

import android.app.Activity
import android.app.Application
import com.example.aaron.compsapp.base.BaseApp
import dagger.android.AndroidInjector

/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp() {
    private val module = MyModule();

    override fun initModule(app: Application) {
        module.initModule(app)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        //TODO
        return module.activityInjector()
    }
}