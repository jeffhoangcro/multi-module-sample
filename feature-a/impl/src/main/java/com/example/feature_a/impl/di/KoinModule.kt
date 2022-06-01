package com.example.feature_a.impl.di

import com.example.feature_a.api.IRepositoryA
import com.example.feature_a.api.IServiceA
import com.example.feature_a.impl.repo.RepositoryA
import com.example.feature_a.impl.service.ServiceA
import org.koin.dsl.bind
import org.koin.dsl.module

val moduleA = module {
    single { RepositoryA() } bind(IRepositoryA::class)
    single { ServiceA() } bind(IServiceA::class)
}