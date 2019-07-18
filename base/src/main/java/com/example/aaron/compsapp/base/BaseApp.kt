package com.example.aaron.compsapp.base

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * 可独立运行的模块对应Application的基础类
 * Created by jph on 2019-07-08.
 */
abstract class BaseApp : Application(), IModule {
    override fun onCreate() {
        super.onCreate()

        initARouter()

        this.initModule(this)
    }

    /**
     * 初始化ARouter
     */
    private fun initARouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }

        ARouter.init(this)
    }
//
//    //TODO
//    abstract fun applicationInjector(): AndroidInjector<out DaggerApplication>
}