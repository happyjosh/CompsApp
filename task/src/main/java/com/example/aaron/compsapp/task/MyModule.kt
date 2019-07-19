package com.example.aaron.compsapp.task

import android.app.Activity
import android.app.Application
import android.util.Log
import com.example.aaron.compsapp.base.IModule
import com.example.aaron.compsapp.base.ModuleLifecycle
import com.example.aaron.compsapp.base.ServeFactory
import com.example.aaron.compsapp.base.initDepsModules
import com.example.aaron.compsapp.task.di.AppModule
import com.example.aaron.compsapp.task.di.DaggerTaskAppComponent
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

/**
 * Created by jph on 2019-07-09.
 */
class MyModule : IModule {
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun initModule(app: Application) {
        Log.i("ZZZ", "--------------")
        Log.i("ZZZ", "init task")
        Log.i("ZZZ", "--------------")
        ModuleLifecycle.moduleInited("task")

        DaggerTaskAppComponent.builder()
            .appModule(AppModule(app))
            .build()
            .inject(this)

        val taskServe = TaskServe(activityInjector)
        ServeFactory.taskServe = taskServe

        initDepsModules(app, BuildConfig.MODULE_DEPENDENCIES);
    }

    override fun activityInjector() = activityInjector
}