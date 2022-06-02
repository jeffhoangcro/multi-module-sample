package com.example.feature_a.impl.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.feature_a.impl.R
import com.example.feature_b.api.repo.IRepositoryB
import com.example.feature_b.api.service.IServiceB
import org.koin.android.ext.android.inject

class ActivityA : AppCompatActivity() {
    private val serviceB: IServiceB by inject()
    private val repoB: IRepositoryB by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        findViewById<Button>(R.id.btn_launch_b).setOnClickListener {
            serviceB.launchB(this)
        }

        findViewById<Button>(R.id.btn_fetch_b).setOnClickListener {
            repoB.introB().let {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        }
    }
}