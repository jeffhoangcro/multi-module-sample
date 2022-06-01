package com.example.feature_a.impl.service

import android.content.Context
import android.content.Intent
import com.example.feature_a.api.IServiceA
import com.example.feature_a.impl.feature.ActivityA

class ServiceA: IServiceA {
    override fun launchA(context: Context) {
        context.startActivity(
            Intent(context, ActivityA::class.java)
        )
    }
}