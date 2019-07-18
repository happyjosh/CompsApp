package com.example.aaron.compsapp.task

import android.app.Activity
import android.app.Application
import com.example.aaron.compsapp.base.BaseApp
import com.example.aaron.compsapp.task.di.AppModule
import com.example.aaron.compsapp.task.di.DaggerTaskAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp(), HasActivityInjector {

    private val module = MyModule();

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun initModule(app: Application) {
        module.initModule(app)
//        DaggerAppComponent.builder().appModule(AppModule(this)).build().inject(this)
        DaggerTaskAppComponent.builder()
            .appModule(AppModule(this))
            .build()
            .inject(this)
    }

    override fun activityInjector() = activityInjector
}