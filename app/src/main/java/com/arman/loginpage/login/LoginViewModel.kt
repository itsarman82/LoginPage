package com.arman.loginpage.login

import android.content.Context
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() :ViewModel() {


    fun login(phone:String,password:String) {
        if (phone.length == 11 && password.isNotBlank()){
            true
        }else{
            false
        }
    }
}