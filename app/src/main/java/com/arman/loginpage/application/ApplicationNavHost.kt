package com.arman.loginpage.application

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.arman.loginpage.login.loginNavigationRoute
import com.arman.loginpage.login.loginScreen

@Composable
fun ApplicationNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = loginNavigationRoute,
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {

        loginScreen()

    }


}

