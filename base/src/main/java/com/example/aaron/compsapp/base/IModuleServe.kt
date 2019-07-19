package com.example.aaron.compsapp.base

import android.app.Activity
import dagger.android.AndroidInjector

/**
 * Created by jph on 2019-07-18.
 */
interface IModuleServe {
    fun getAndroidInjector(): AndroidInjector<Activity>
}