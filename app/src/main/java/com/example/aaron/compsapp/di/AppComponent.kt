package com.example.aaron.compsapp.di

import com.example.aaron.compsapp.MyModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by jph on 2019-07-16.
 */
//@Singleton
@Component(
//    dependencies = [TaskAppComponent::class],
    modules = [
        AppModule::class,
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        BuildersModule::class
    ]
)
interface AppComponent {

    fun inject(app: MyModule)
}