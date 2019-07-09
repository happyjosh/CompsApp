package com.example.aaron.compsapp.task

import android.app.Application
import android.util.Log
import com.example.aaron.compsapp.base.IModule
import com.example.aaron.compsapp.base.ServeFactory
import com.example.aaron.compsapp.base.initDepsModules

/**
 * Created by jph on 2019-07-09.
 */
class MyModule : IModule {
    override fun initModule(app: Application) {
        Log.i("ZZZ", "--------------")
        Log.i("ZZZ", "init task")
        Log.i("ZZZ", "--------------")
        ServeFactory.taskServe = TaskServe()

        initDepsModules(app, BuildConfig.MODULE_DEPENDENCIES);
    }

}