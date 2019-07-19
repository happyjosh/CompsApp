package com.example.aaron.compsapp.task.di

import com.example.aaron.compsapp.task.TaskActivity
import com.example.aaron.compsapp.task.details.DetailsActivity
import com.example.aaron.compsapp.task.details.di.DetailsModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jph on 2019-07-16.
 */
@Module
abstract class BuildersModule {

    @ContributesAndroidInjector(modules = [DetailsModule::class])
    abstract fun detailsInjector(): DetailsActivity


    @ContributesAndroidInjector
    abstract fun taskInjector(): TaskActivity
}