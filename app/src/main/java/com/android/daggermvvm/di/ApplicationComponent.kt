package com.android.daggermvvm.di

import com.android.daggermvvm.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton // Because network module has singleton providers
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}