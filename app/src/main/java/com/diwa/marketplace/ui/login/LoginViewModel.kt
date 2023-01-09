package com.diwa.marketplace.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.diwa.marketplace.core.data.repository.AppRepository

class LoginViewModel(val repo: AppRepository) : ViewModel() {

    private val _text= MutableLiveData<String>().apply {
        value = "Hi, Jawahiir Abdillah"
    }

    val text: LiveData<String> = _text

    fun ubahData(){
        _text.postValue("Welcome back!")
    }
}