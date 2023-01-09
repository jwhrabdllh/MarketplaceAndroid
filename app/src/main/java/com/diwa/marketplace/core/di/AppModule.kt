package com.diwa.marketplace.core.di

import com.diwa.marketplace.core.data.source.local.LocalData
import com.diwa.marketplace.core.data.source.remote.RemoteData
import com.diwa.marketplace.core.data.source.remote.network.ApiConfig
import org.koin.dsl.module

// konsep dependecy injection

val appModule = module {
    single { ApiConfig.provideApiService }
    single { RemoteData(get()) }
    single { LocalData() }
}