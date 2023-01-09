package com.diwa.marketplace.utils

import android.app.Application
import com.diwa.marketplace.core.di.appModule
import com.diwa.marketplace.core.di.repositoryModule
import com.diwa.marketplace.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}