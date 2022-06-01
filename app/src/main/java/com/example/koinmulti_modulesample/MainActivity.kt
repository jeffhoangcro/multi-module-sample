package com.example.koinmulti_modulesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.feature_a.api.IServiceA
import com.example.feature_b.api.service.IServiceB
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    val serviceA: IServiceA by inject()
    val serviceB: IServiceB by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_launch_a).setOnClickListener {
            serviceA.launchA(this)
        }

        findViewById<Button>(R.id.btn_launch_b).setOnClickListener {
            serviceB.launchB(this)
        }
    }
}