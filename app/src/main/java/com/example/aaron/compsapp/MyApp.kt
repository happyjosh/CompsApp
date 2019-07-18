package com.example.aaron.compsapp

import android.app.Activity
import android.app.Application
import com.example.aaron.compsapp.base.BaseApp
import com.example.aaron.compsapp.di.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp(), HasActivityInjector {

    private val module = MyModule();
    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>


    override fun initModule(app: Application) {
        module.initModule(app)

//        val taskAppComponent = DaggerTaskAppComponent.builder().build()

        DaggerAppComponent.builder()
//            .taskAppComponent(taskAppComponent)
            .build()
            .inject(this)

    }

    override fun activityInjector() = dispatchingActivityInjector

    //    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        return DaggerAppComponent.builder().build()
//    }
}