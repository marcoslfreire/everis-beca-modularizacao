package com.niemietz.everis.beca.modularizacao.login.interfaces

import com.example.login.constants.APIConstants.AUTHENTICATE
import com.example.login.constants.APIConstants.GET_SESSION
import com.niemietz.everis.beca.modularizacao.login.model.GETSessionResponse
import com.niemietz.everis.beca.modularizacao.login.model.GETSessionRequest
import com.niemietz.everis.beca.modularizacao.login.model.AuthenticateResponse
import com.niemietz.everis.beca.modularizacao.login.model.AuthenticateRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginAPI {
    @POST(GET_SESSION)
    suspend fun getSession(
        @Body request: GETSessionRequest
    ): GETSessionResponse

    @POST(AUTHENTICATE)
    suspend fun authenticate(
        @Body request: AuthenticateRequest
    ): AuthenticateResponse
}