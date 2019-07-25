package com.example.aaron.compsapp.task.details

import io.reactivex.Flowable

/**
 * Created by jph on 2019-07-25.
 */
interface ITaskDetailsRepo {
    fun loadTaskDetails(id: Int): Flowable<TaskDetailsM>
}