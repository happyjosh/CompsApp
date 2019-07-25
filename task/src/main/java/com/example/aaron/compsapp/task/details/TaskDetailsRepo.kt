package com.example.aaron.compsapp.task.details

import io.reactivex.Flowable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by jph on 2019-07-15.
 */
@Singleton
class TaskDetailsRepo
@Inject constructor() {

    fun loadTaskDetails(id: Int): Flowable<TaskDetailsM> {
        return Flowable.just(TaskDetailsM(id, "xxxx-$id"))
    }
}