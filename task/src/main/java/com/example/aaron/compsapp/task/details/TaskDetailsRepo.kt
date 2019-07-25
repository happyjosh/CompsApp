package com.example.aaron.compsapp.task.details

import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by jph on 2019-07-15.
 */
class TaskDetailsRepo
@Inject constructor() : ITaskDetailsRepo {

    override fun loadTaskDetails(id: Int): Flowable<TaskDetailsM> {
        return Flowable.just(TaskDetailsM(id, "xxxx-$id"))
    }
}