package com.example.aaron.compsapp.task

import android.os.Bundle
import com.example.aaron.compsapp.base.BasicActivity
import com.example.aaron.compsapp.base.XAndroidInjection
import dagger.android.AndroidInjection

/**
 * Created by jph on 2019-07-19.
 */
open class BaseActivity : BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        XAndroidInjection.flag = BuildConfig.MODULE_NAME
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}