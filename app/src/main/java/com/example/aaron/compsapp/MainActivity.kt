package com.example.aaron.compsapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var tm: TestM

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_activity_main)

        val taskBtn = findViewById<Button>(R.id.main_btn_task)
        taskBtn.text = tm.str
        taskBtn.setOnClickListener {
            ARouter.getInstance().build("/task/main")
                .withInt("level", 22)
                .navigation()
        }
    }
}
