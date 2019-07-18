package com.example.aaron.compsapp.di

import com.example.aaron.compsapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jph on 2019-07-16.
 */
@Module
abstract class BuildersModule {

    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainInjector(): MainActivity
}