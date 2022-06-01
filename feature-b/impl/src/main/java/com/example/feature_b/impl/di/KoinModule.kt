package com.example.feature_b.impl.di

import com.example.feature_b.api.repo.IRepositoryB
import com.example.feature_b.api.service.IServiceB
import com.example.feature_b.impl.repo.RepositoryB
import com.example.feature_b.impl.service.ServiceB
import org.koin.dsl.bind
import org.koin.dsl.module

val moduleB = module {
    single { RepositoryB() } bind (IRepositoryB::class)
    single { ServiceB() } bind (IServiceB::class)
}