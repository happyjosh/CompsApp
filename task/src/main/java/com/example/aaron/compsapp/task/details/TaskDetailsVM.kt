package com.example.aaron.compsapp.task.details

import androidx.lifecycle.MutableLiveData
import com.example.aaron.compsapp.base.BaseVM
import com.trello.rxlifecycle3.kotlin.bindToLifecycle
import timber.log.Timber
import javax.inject.Inject


/**
 * Created by jph on 2019-07-10.
 */
class TaskDetailsVM
@Inject
constructor(private val taskDetailsRepo: TaskDetailsRepo) : BaseVM() {
    var taskDetails = MutableLiveData<TaskDetailsM>()

//    @Inject
//    lateinit var taskDetailsRepo: TaskDetailsRepo

    //    @SuppressLint("CheckResult")
    fun loadTaskDetails(id: Int) {
        taskDetailsRepo.loadTaskDetails(id)
            .bindToLifecycle(this)
            .subscribe {
                taskDetails.value = it
                Timber.i("==================X")
            }
//            .addTo(CompositeDisposable())
    }

}