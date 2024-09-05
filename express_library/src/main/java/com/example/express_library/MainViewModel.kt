package com.example.express_library

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

 class MainViewModel : ViewModel() {

    private val _count = MutableLiveData(0)
    val count: LiveData<Int> get() = _count

    fun countClick() {
        _count.value = _count.value?.plus(1)
    }
}