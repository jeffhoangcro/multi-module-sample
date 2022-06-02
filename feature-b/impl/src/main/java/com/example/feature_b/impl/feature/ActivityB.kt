package com.example.feature_b.impl.feature

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.feature_a.api.IRepositoryA
import com.example.feature_a.api.IServiceA
import com.example.feature_b.impl.R
import org.koin.android.ext.android.inject

class ActivityB: AppCompatActivity() {
    private val serviceA: IServiceA by inject()
    private val repoA: IRepositoryA by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        findViewById<Button>(R.id.btn_launch_a).setOnClickListener {
            serviceA.launchA(this)
        }

        findViewById<Button>(R.id.btn_fetch_a).setOnClickListener {
            repoA.introA().let {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        }
    }
}