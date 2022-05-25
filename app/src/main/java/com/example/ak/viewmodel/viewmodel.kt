package com.example.ak.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class viewmodel : ViewModel() {

    private val _viewModelName = MutableLiveData< String>()
    val viewModelName: LiveData<String>
     get() = _viewModelName

    init {
        _viewModelName.value = "Rakesh singh"
    }

    fun namechange(){
        _viewModelName.value = "Rakesh"
    }
}