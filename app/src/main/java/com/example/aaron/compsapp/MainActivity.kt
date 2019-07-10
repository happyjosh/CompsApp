package com.example.aaron.compsapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customersBtn = findViewById<Button>(R.id.main_btn_task)
        customersBtn.setOnClickListener {
            ARouter.getInstance().build("/task/main")
                .withInt("level", 22)
                .navigation()
        }
    }
}
