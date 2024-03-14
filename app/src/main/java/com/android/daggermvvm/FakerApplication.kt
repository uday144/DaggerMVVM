package com.android.daggermvvm

import android.app.Application
import com.android.daggermvvm.di.ApplicationComponent
import com.android.daggermvvm.di.DaggerApplicationComponent

class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent =  DaggerApplicationComponent.builder().build()

    }

}