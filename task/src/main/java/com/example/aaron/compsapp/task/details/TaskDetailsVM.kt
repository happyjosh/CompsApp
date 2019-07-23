package com.example.aaron.compsapp.task.details

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject


/**
 * Created by jph on 2019-07-10.
 */
class TaskDetailsVM @Inject constructor() : ViewModel() {
    var taskDetails = MutableLiveData<TaskDetailsM>()
}