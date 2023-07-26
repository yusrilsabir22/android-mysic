package com.blondev.mysic.webservice

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

abstract class MysicAPI {


    companion object {
        val baseURL = "http://10.0.2.2:3000/api/v1"

        @Volatile
        private var HOME_INSTANCE : HomeAPI? = null

        private fun getInstance(): Retrofit {
            return Retrofit.Builder().baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        private fun createHomeInstance(): HomeAPI {
            val instance = getInstance().create(HomeAPI::class.java)
            HOME_INSTANCE = instance
            return instance
        }

        fun getHomeAPI(): HomeAPI {
            return HOME_INSTANCE ?:createHomeInstance()
        }
    }
}