package com.example.aaron.compsapp.di

import com.example.aaron.compsapp.MyModule
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
//    dependencies = [ModuleComponent::class],
    modules = [
        AppModule::class,
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        BuildersModule::class
    ]
)
interface ModuleComponent : AndroidInjector<MyModule> {

//    fun inject(app: MyModule)
}