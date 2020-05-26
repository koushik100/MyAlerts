package com.koushik.myalerts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.koushik.myalertlibrary.SimpleAlert
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            SimpleAlert(this, "TEST").show()
        }
    }
}
