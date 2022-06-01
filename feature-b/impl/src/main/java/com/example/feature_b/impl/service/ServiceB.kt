package com.example.feature_b.impl.service

import android.content.Context
import android.content.Intent
import com.example.feature_b.api.service.IServiceB
import com.example.feature_b.impl.feature.ActivityB

class ServiceB: IServiceB {
    override fun launchB(context: Context) {
        context.startActivity(
            Intent(context, ActivityB::class.java)
        )
    }
}