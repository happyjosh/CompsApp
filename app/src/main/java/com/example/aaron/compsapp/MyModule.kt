package com.example.aaron.compsapp

import android.app.Activity
import android.app.Application
import com.example.aaron.compsapp.base.IModule
import com.example.aaron.compsapp.base.ModuleLifecycle
import com.example.aaron.compsapp.base.initDepsModules
import com.example.aaron.compsapp.di.DaggerModuleComponent
import dagger.android.DispatchingAndroidInjector
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by jph on 2019-07-09.
 */
class MyModule : IModule {
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun initModule(app: Application) {
        Timber.tag("ZZZ").i("--------------")
        Timber.tag("ZZZ").i("init app")
        Timber.tag("ZZZ").i("--------------")
        ModuleLifecycle.moduleInited(BuildConfig.MODULE_NAME)
        initDepsModules(app, BuildConfig.MODULE_DEPENDENCIES);

        DaggerModuleComponent.builder()
            .build()
            .inject(this)
    }


    override fun activityInjector() = activityInjector
}