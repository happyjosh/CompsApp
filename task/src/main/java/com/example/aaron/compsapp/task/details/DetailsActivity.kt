package com.example.aaron.compsapp.task.details

import android.content.Context
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.aaron.compsapp.base.ServeFactory
import com.example.aaron.compsapp.task.BaseActivity
import com.example.aaron.compsapp.task.R
import com.example.aaron.compsapp.task.databinding.TaskActivityDetailsBinding
import kotlinx.android.synthetic.main.task_activity_details.*
import timber.log.Timber
import javax.inject.Inject


class DetailsActivity : BaseActivity() {

//    private lateinit var dataBinding: ActivityDetailsBinding

    @Inject
    lateinit var testDDetails: TaskDetailsM

    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.task_activity_details)
        val dataBinding = DataBindingUtil.setContentView<TaskActivityDetailsBinding>(
            this,
            R.layout.task_activity_details
        )


        Timber.i("--------------")
        Timber.i("customer count: %s", ServeFactory.customerServe?.getCustomerCount())
        Timber.i("--- %s", testDDetails.title)
        Timber.i("--------------")

        val taskDetailsVM = ViewModelProviders.of(this)
            .get(TaskDetailsVM::class.java)
        dataBinding.vm = taskDetailsVM
        dataBinding.lifecycleOwner = this

//        taskDetailsVM.taskDetails.observe(this, Observer { details_txt_title.text = it.title })

        details_btn_change.setOnClickListener {
            Timber.i("XXXXXXX")
            taskDetailsVM.taskDetails.value = testDDetails
        }
    }
}