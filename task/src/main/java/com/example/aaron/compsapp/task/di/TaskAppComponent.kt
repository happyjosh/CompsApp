package com.example.aaron.compsapp.task.di

import com.example.aaron.compsapp.task.MyApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by jph on 2019-07-16.
 */
//@Singleton
@Component(
    modules = [
        AppModule::class,
        BuildersModule::class,
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class
    ]
)
interface TaskAppComponent {

//    val appContext: Context

    fun inject(app: MyApp)
}