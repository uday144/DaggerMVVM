package com.android.daggermvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.daggermvvm.models.Product
import com.android.daggermvvm.repository.ProductRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: ProductRepository, private val randomize: Randomize
) : ViewModel() {

    val productsLiveData: LiveData<List<Product>>
        get() = repository.products

    init {
        viewModelScope.launch {
            delay(2000)
            repository.getProducts()
        }
    }

}

class Randomize @Inject constructor() {
    fun doAction() {
        //todo
    }
}