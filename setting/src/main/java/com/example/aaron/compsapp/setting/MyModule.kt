package com.example.aaron.compsapp.setting

import android.app.Activity
import android.app.Application
import android.util.Log
import com.example.aaron.compsapp.base.IModule
import com.example.aaron.compsapp.base.ModuleLifecycle
import com.example.aaron.compsapp.base.initDepsModules
import dagger.android.AndroidInjector

/**
 * Created by jph on 2019-07-09.
 */
class MyModule : IModule {
    override fun activityInjector(): AndroidInjector<Activity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initModule(app: Application) {
        Log.i("ZZZ", "--------------")
        Log.i("ZZZ", "init setting")
        Log.i("ZZZ", "--------------")
        ModuleLifecycle.moduleInited(BuildConfig.MODULE_NAME)
        initDepsModules(app, BuildConfig.MODULE_DEPENDENCIES);
    }

}