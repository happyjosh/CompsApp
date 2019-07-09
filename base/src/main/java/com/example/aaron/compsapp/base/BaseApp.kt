package com.example.aaron.compsapp.base

import android.app.Application

/**
 * 可独立运行的模块对应Application的基础类
 * Created by jph on 2019-07-08.
 */
abstract class BaseApp : Application(), IModule {
    override fun onCreate() {
        super.onCreate()
        this.initModule(this)
    }
}