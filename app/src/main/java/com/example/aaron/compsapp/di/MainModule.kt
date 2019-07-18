package com.example.aaron.compsapp.di

import com.example.aaron.compsapp.TestM
import dagger.Module
import dagger.Provides

/**
 * Created by jph on 2019-07-16.
 */
@Module
class MainModule {

    @Provides
    fun provideString(): TestM {
        return TestM("hehehe")
    }
}