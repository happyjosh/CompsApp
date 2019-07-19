package com.example.aaron.compsapp.task.details

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.aaron.compsapp.base.XAndroidInjection
import com.example.aaron.compsapp.task.R
import com.example.aaron.compsapp.task.databinding.TaskActivityDetailsBinding
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.task_activity_details.*
import javax.inject.Inject


const val TAG: String = "TaskDetails"

class DetailsActivity : AppCompatActivity() {

//    private lateinit var dataBinding: ActivityDetailsBinding

    @Inject
    lateinit var testDDetails: TaskDetailsM

    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        XAndroidInjection.flag = "task"
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.task_activity_details)
        val dataBinding = DataBindingUtil.setContentView<TaskActivityDetailsBinding>(
            this,
            R.layout.task_activity_details
        )


        Log.i(TAG, "--------------")
//        Log.i(TAG, "customer count:${ServeFactory.customerServe?.getCustomerCount()}")
        Log.i(TAG, "---" + testDDetails.title)
        Log.i(TAG, "--------------")

        val taskDetailsVM = ViewModelProviders.of(this)
            .get(TaskDetailsVM::class.java)
        dataBinding.vm = taskDetailsVM
        dataBinding.lifecycleOwner = this

//        taskDetailsVM.taskDetails.observe(this, Observer { details_txt_title.text = it.title })

        details_btn_change.setOnClickListener {
            Log.i("===========", "XXXXXXX")
            taskDetailsVM.taskDetails.value = testDDetails
        }
    }
}