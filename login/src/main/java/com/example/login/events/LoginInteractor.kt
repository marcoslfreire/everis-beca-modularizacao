package com.niemietz.everis.beca.modularizacao.login.events

sealed class LoginInteractor {
    object GetSession: LoginInteractor()
    data class Authenticate(val password: String): LoginInteractor()
}