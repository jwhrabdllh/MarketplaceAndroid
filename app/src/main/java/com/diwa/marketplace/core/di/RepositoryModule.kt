package com.diwa.marketplace.core.di

import com.diwa.marketplace.core.data.repository.AppRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AppRepository(get(), get()) }
}