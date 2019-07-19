package com.example.aaron.compsapp

import android.app.Activity
import android.app.Application
import android.util.Log
import com.example.aaron.compsapp.base.IModule
import com.example.aaron.compsapp.base.ModuleLifecycle
import com.example.aaron.compsapp.base.initDepsModules
import com.example.aaron.compsapp.di.DaggerAppComponent
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
        Log.i("ZZZ", "init app")
        Log.i("ZZZ", "--------------")
        ModuleLifecycle.moduleInited("app")
        initDepsModules(app, BuildConfig.MODULE_DEPENDENCIES);


//        val taskAppComponent = DaggerTaskAppComponent.builder().appModule(AppModule(this)).build()
//
//        taskAppComponent.inject(this)

        DaggerAppComponent.builder()
//            .taskAppComponent(taskAppComponent)
            .build()
            .inject(this)
    }


    override fun activityInjector() = activityInjector
}