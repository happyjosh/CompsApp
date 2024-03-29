package com.example.aaron.compsapp.task.details

import android.content.Context
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.aaron.compsapp.base.ServeFactory
import com.example.aaron.compsapp.task.BaseActivity
import com.example.aaron.compsapp.task.R
import com.example.aaron.compsapp.task.databinding.TaskActivityDetailsBinding
import kotlinx.android.synthetic.main.task_activity_details.*
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Named


class DetailsActivity : BaseActivity() {

//    private lateinit var dataBinding: ActivityDetailsBinding

//    @Inject
//    lateinit var testDDetails: TaskDetailsM

    @Inject
    lateinit var context: Context

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory

    @field:[Inject Named("jackName")]
    lateinit var jackName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.task_activity_details)
        val dataBinding = DataBindingUtil.setContentView<TaskActivityDetailsBinding>(
            this,
            R.layout.task_activity_details
        )


        Timber.i("--------------")
        Timber.i("customer count: %s", ServeFactory.customerServe?.getCustomerCount())
//        Timber.i("--- %s", testDDetails.title)
        Timber.i(jackName)
        Timber.i("--------------")

        val taskDetailsVM = ViewModelProviders.of(this, vmFactory)
            .get(TaskDetailsVM::class.java)
        dataBinding.vm = taskDetailsVM
        dataBinding.lifecycleOwner = this

//        taskDetailsVM.taskDetails.observe(this, Observer { details_txt_title.text = it.title })

        details_btn_change.setOnClickListener {
            //            Timber.i("XXXXXXX")
//            taskDetailsVM.taskDetails.value = testDDetails
            taskDetailsVM.loadTaskDetails(2003)
        }
    }
}