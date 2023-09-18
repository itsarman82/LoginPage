package com.arman.loginpage

sealed interface MainUIState {
    object UnAuthorized
    object Authorized
    object Signin
}