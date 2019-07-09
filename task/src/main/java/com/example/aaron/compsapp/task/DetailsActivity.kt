package com.example.aaron.compsapp.task

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.aaron.compsapp.base.ServeFactory


const val TAG: String = "TaskDetails"

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        Log.i(TAG, "--------------")
        Log.i(TAG, "customer count:${ServeFactory.customerServe?.getCustomerCount()}")
        Log.i(TAG, "--------------")
    }
}