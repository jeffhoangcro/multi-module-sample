package com.example.koinmulti_modulesample

import android.app.Application
import com.example.feature_a.impl.di.moduleA
import com.example.feature_b.impl.di.moduleB
import org.koin.core.context.GlobalContext.startKoin

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(moduleA,moduleB)
        }
    }
}