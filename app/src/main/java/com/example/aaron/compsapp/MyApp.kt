package com.example.aaron.compsapp

import android.app.Activity
import android.app.Application
import com.example.aaron.compsapp.base.BaseApp
import com.example.aaron.compsapp.base.ServeFactory
import com.example.aaron.compsapp.base.XAndroidInjection
import dagger.android.AndroidInjector

/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp() {

    private val module = MyModule()


    override fun initModule(app: Application) {
        module.initModule(app)

    }

    //    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        return DaggerAppComponent.builder().build()
//    }

    override fun activityInjector(): AndroidInjector<Activity> {
        var activityInjector: AndroidInjector<Activity> = module.activityInjector

        if (XAndroidInjection.flag == "task") {
            activityInjector = ServeFactory.taskServe.getAndroidInjector()
        }

        return activityInjector
    }

}