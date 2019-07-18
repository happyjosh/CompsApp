package com.example.aaron.compsapp

import android.app.Application
import com.example.aaron.compsapp.base.BaseApp
import com.example.aaron.compsapp.di.DaggerAppComponent

/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp() {

    private val module = MyModule()


    override fun initModule(app: Application) {
        module.initModule(app)

//        val taskAppComponent = DaggerTaskAppComponent.builder().appModule(AppModule(this)).build()
//
//        taskAppComponent.inject(this)

        DaggerAppComponent.builder()
//            .taskAppComponent(taskAppComponent)
            .build()
            .inject(this)

    }

    //    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        return DaggerAppComponent.builder().build()
//    }
}