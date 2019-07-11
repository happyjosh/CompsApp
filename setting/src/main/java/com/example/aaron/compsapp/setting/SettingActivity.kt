package com.example.aaron.compsapp.setting

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting_activity_setting)

        val btn = findViewById<Button>(R.id.setting_btn_to_details)
        btn.setOnClickListener { v -> toDetails(v) }
    }

    private fun toDetails(v: View) {
        val intent = Intent(this, DetailsActivity::class.java)
        startActivity(intent)
    }
}
