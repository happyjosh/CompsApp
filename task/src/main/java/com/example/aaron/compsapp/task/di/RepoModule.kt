package com.example.aaron.compsapp.task.di

import com.example.aaron.compsapp.task.details.ITaskDetailsRepo
import com.example.aaron.compsapp.task.details.TaskDetailsRepo
import dagger.Binds
import dagger.Module

/**
 * Created by jph on 2019-07-25.
 */
@Module
interface RepoModule {
    @Binds
    fun provideTaskDetailsRepo(taskDetailsRepo: TaskDetailsRepo): ITaskDetailsRepo
}