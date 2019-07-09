package com.example.aaron.compsapp.base

import android.app.Application

/**
 * 模块的基础接口
 * Created by jph on 2019-07-09.
 */
interface IModule {
    fun initModule(app: Application)
}