package com.example.aaron.compsapp.task.di

import com.example.aaron.compsapp.task.MyModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by jph on 2019-07-16.
 */
@Singleton
@Component(
    modules = [
        AppModule::class,
        BuildersModule::class,
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class
    ]
)
interface ModuleComponent : AndroidInjector<MyModule> {

//    val appContext: Context

//    fun inject(app: MyModule)
}