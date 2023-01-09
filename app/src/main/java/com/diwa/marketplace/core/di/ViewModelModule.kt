package com.diwa.marketplace.core.di

import com.diwa.marketplace.ui.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

// disini yg akan dipanggil yaitu semua view model yg digunakan

val viewModelModule = module {
    viewModel { LoginViewModel(get()) }
}