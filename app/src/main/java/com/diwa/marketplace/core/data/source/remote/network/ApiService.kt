package com.diwa.marketplace.core.data.source.remote.network

import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.POST

interface ApiService {

    // handle routing di api laravel
    @POST("login")
    suspend fun login(
        //@Body user: User
    ): Response<RequestBody>
}