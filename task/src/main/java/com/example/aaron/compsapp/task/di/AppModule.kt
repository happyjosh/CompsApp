package com.example.aaron.compsapp.task.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by jph on 2019-07-16.
 */
@Module(
    includes = [VMModule::class, RepoModule::class]
)
class AppModule constructor(private val context: Context) {
    @Singleton
    @Provides
    fun provideContext(): Context {
        return context.applicationContext
    }
}