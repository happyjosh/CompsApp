package com.example.aaron.compsapp.task.details

import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.FlowableOnSubscribe
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by jph on 2019-07-15.
 */
@Singleton
class TaskDetailsRepo
@Inject constructor() {

    fun loadTaskDetails(id: Int): Flowable<TaskDetailsM> {
//        return Flowable.just(TaskDetailsM(id, "xxxx-$id"))
        return Flowable
            .create(FlowableOnSubscribe<TaskDetailsM> { s ->
                Flowable.timer(2, TimeUnit.SECONDS).subscribe {
                    s.onNext(TaskDetailsM(id, "xxxx-$id"))
                    s.onComplete()
                }
            }, BackpressureStrategy.ERROR)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}