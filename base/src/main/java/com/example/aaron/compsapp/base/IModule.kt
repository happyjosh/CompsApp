package com.example.aaron.compsapp.base

import android.app.Application
import dagger.android.HasActivityInjector

/**
 * 模块的基础接口
 * Created by jph on 2019-07-09.
 */
interface IModule : HasActivityInjector {
    fun initModule(app: Application)
}