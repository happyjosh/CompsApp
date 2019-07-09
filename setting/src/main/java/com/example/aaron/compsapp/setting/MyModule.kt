package com.example.aaron.compsapp.setting

import android.app.Application
import android.util.Log
import com.example.aaron.compsapp.base.IModule
import com.example.aaron.compsapp.base.ModuleLifecycle
import com.example.aaron.compsapp.base.initDepsModules

/**
 * Created by jph on 2019-07-09.
 */
class MyModule : IModule {
    override fun initModule(app: Application) {
        Log.i("ZZZ", "--------------")
        Log.i("ZZZ", "init setting")
        Log.i("ZZZ", "--------------")
        ModuleLifecycle.moduleInited("setting")
        initDepsModules(app, BuildConfig.MODULE_DEPENDENCIES);
    }

}