package com.example.aaron.compsapp.task.details

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.aaron.compsapp.base.ServeFactory
import com.example.aaron.compsapp.task.R
import com.example.aaron.compsapp.task.databinding.TaskActivityDetailsBinding
import kotlinx.android.synthetic.main.task_activity_details.*


const val TAG: String = "TaskDetails"

class DetailsActivity : AppCompatActivity() {

//    private lateinit var dataBinding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.task_activity_details)
        val dataBinding = DataBindingUtil.setContentView<TaskActivityDetailsBinding>(
            this,
            R.layout.task_activity_details
        )


        Log.i(TAG, "--------------")
        Log.i(TAG, "customer count:${ServeFactory.customerServe?.getCustomerCount()}")
        Log.i(TAG, "--------------")

        val taskDetailsVM = ViewModelProviders.of(this)
            .get(TaskDetailsVM::class.java)
        dataBinding.vm = taskDetailsVM
        dataBinding.lifecycleOwner = this

//        taskDetailsVM.taskDetails.observe(this, Observer { details_txt_title.text = it.title })

        details_btn_change.setOnClickListener {
            Log.i("===========", "XXXXXXX")
            taskDetailsVM.taskDetails.value = TaskDetailsM(2, "No.22222个")
        }
    }
}