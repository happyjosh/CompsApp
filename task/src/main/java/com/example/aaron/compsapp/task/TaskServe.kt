package com.example.aaron.compsapp.task

import android.app.Activity
import com.example.aaron.compsapp.base.ITaskServe
import dagger.android.AndroidInjector

/**
 * Created by jph on 2019-07-08.
 */
class TaskServe(val anInjector: AndroidInjector<Activity>) : ITaskServe {

    override fun getTaskCount(): Int {
        return 101
    }

    override fun getAndroidInjector(): AndroidInjector<Activity> {
        return anInjector
    }
}