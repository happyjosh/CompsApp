package com.example.aaron.compsapp.task.details.di

import com.example.aaron.compsapp.task.details.TaskDetailsM
import dagger.Module
import dagger.Provides

/**
 * Created by jph on 2019-07-16.
 */
@Module
class DetailsModule {

    @Provides
    fun provideDetailsM(): TaskDetailsM {
        return TaskDetailsM(33, "ttt333")
    }
}