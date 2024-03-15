package com.android.daggermvvm.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.android.daggermvvm.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton // Because network module has singleton providers
@Component(modules = [NetworkModule::class, DatabaseModule::class, ViewModelModules::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}