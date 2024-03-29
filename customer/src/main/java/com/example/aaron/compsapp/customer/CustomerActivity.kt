package com.example.aaron.compsapp.customer

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CustomerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.customer_activity_task)

        val btn = findViewById<Button>(R.id.customer_btn_to_details)
        btn.setOnClickListener { v -> toDetails(v) }
    }

    private fun toDetails(v: View) {
        val intent = Intent(this, DetailsActivity::class.java)
        startActivity(intent)
    }
}
