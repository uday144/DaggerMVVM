package com.android.daggermvvm.viewmodels

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel2 @Inject constructor(private val randomize: Randomize): ViewModel() {
    init {
        randomize.doAction()
    }
}