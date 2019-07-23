package com.example.aaron.compsapp.task.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.aaron.compsapp.base.VMFactory
import com.example.aaron.compsapp.base.di.VMKey
import com.example.aaron.compsapp.task.details.TaskDetailsVM
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by jph on 2019-07-23.
 */
@Module
abstract class VMModule {

    @Binds
    abstract fun bindVMFactory(factory: VMFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @VMKey(TaskDetailsVM::class)
    abstract fun bindTaskDetailsVM(taskDetailsVM: TaskDetailsVM): ViewModel
}