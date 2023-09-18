package com.arman.loginpage.login

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun LoginRoute(viewModel: LoginViewModel = hiltViewModel()) {

    LoginScreen(onClickLogin = { phone, password ->
        viewModel.login(phone,password)
    }, onClickSignin = {})
}