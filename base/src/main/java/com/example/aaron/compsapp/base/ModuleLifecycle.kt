package com.example.aaron.compsapp.base

/**
 * Created by jph on 2019-07-09.
 */
object ModuleLifecycle {
    private val moduleMap: MutableMap<String, Boolean> = HashMap()

    fun moduleInited(moduleName: String) {
        moduleMap.put(moduleName, true)
    }

    fun isInitedModule(moduleName: String): Boolean {
        return moduleMap[moduleName] == true
    }
}