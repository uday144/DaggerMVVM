package com.android.daggermvvm.di

import androidx.lifecycle.ViewModel
import com.android.daggermvvm.viewmodels.MainViewModel
import com.android.daggermvvm.viewmodels.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModules {

    @Binds
    @ClassKey(MainViewModel::class)
    @IntoMap
    abstract fun mainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @ClassKey(MainViewModel2::class)
    @IntoMap
    abstract fun mainViewModel2(mainViewModel2: MainViewModel2): ViewModel
}