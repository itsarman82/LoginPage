package com.arman.loginpage.login

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

const val loginNavigationRoute = "login_route"


fun NavHostController.navigateToLogin() {
}


fun NavGraphBuilder.loginScreen(){
    composable(loginNavigationRoute){
        LoginRoute()
    }
}