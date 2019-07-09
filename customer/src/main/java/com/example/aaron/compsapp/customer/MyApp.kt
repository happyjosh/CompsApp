package com.example.aaron.compsapp.customer

import android.app.Application
import android.util.Log
import com.example.aaron.compsapp.base.BaseApp
import com.example.aaron.compsapp.base.ServeFactory

/**
 * Created by jph on 2019-07-08.
 */
class MyApp : BaseApp() {
    override fun onCreate() {
        super.onCreate()

    }

    override fun initModule(app: Application) {

        Log.i("ZZZ", "--------------")
        Log.i("ZZZ", "init customer")
        Log.i("ZZZ", "--------------")
        ServeFactory.customerServe = CustomerServe();
    }

}