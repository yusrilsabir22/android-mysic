package com.blondev.mysic.webservice

import retrofit2.Response
import retrofit2.http.GET

interface HomeAPI {
    @GET("/home")
    suspend fun getHome() : Response<Models.Home>
}