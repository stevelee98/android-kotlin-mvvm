package com.viettech.baseproject.module

import com.viettech.baseproject.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    // Config view model
    viewModel {
        HomeViewModel(get())
    }
}