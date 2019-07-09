package com.example.aaron.compsapp.base

import android.app.Application

/**
 * 获取依赖的module对应的App类名
 * Created by jph on 2019-07-08.
 */
fun initDepsClass(runApp: Application, moduleNames: Array<String>) {
//BuildConfig.APP_PKG
    moduleNames.forEach {
        val moduleApp: BaseApp = Class.forName("${BuildConfig.APP_PKG}.${it}.MyApp").newInstance() as BaseApp
        moduleApp.initModule(runApp)
    }
}