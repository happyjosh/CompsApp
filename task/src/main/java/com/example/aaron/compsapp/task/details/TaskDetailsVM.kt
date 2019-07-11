package com.example.aaron.compsapp.task.details

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


/**
 * Created by jph on 2019-07-10.
 */
class TaskDetailsVM : ViewModel() {
    var taskDetails = MutableLiveData<TaskDetailsM>()
}