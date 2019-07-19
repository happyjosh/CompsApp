package com.example.aaron.compsapp.task

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.aaron.compsapp.task.details.DetailsActivity

@Route(path = "/task/main")
class TaskActivity : BaseActivity() {

    @Autowired
    @JvmField
    var level: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task_activity_task)

        val btn = findViewById<Button>(R.id.task_btn_to_details)
        btn.setOnClickListener { v -> toDetails(v) }

        btn.setText("toDetails_$level")
    }

    private fun toDetails(v: View) {
        val intent = Intent(this, DetailsActivity::class.java)
        startActivity(intent)
    }
}
