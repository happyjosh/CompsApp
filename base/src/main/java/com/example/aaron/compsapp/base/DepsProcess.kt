package com.example.aaron.compsapp.base

import android.app.Application

/**
 * 获取依赖的module对应的App类名
 * Created by jph on 2019-07-08.
 */
fun initDepsModules(runApp: Application, moduleNames: Array<String>) {
    moduleNames.forEach {
        val module: IModule = Class.forName("${BuildConfig.APP_PKG}.${it}.MyModule").newInstance() as IModule
        module.initModule(runApp)
    }
}