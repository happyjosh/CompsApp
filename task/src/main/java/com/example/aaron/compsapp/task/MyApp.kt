package com.example.aaron.compsapp.task

import android.app.Application
import com.example.aaron.compsapp.base.BaseApp
import com.example.aaron.compsapp.base.ServeFactory
import com.example.aaron.compsapp.base.initDepsClass

/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp() {

    override fun onCreate() {
        super.onCreate()


    }

    override fun initModule(app: Application) {
        ServeFactory.taskServe = TaskServe()

        initDepsClass(this, BuildConfig.TASK_DEPENDENCIES);
    }
}