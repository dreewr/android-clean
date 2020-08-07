package com.deco.remote.service

import com.google.gson.Gson
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitServiceFactory {
    val BASE_URL: String = "https://maps.googleapis.com/maps/api/"

    //TODO: Uma função para cada service diferente
    //https://stackoverflow.com/questions/18478258/android-retrofit-parameterized-headers
    fun makeRetrofitService(isDebug: Boolean):RetrofitService {
        val okHttpClient = makeOkHttpClient(
            makeLoggingInterceptor((isDebug)))
        return makeRetrofitService(okHttpClient, Gson())
    }

    //TODO: Avaliar o uso de URL Base dinâmica usando esse método
    private fun makeRetrofitService(okHttpClient: OkHttpClient, gson: Gson): RetrofitService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
        return retrofit.create(RetrofitService::class.java)
    }

    private fun makeOkHttpClient(httpLoggingInterceptor: Interceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .addInterceptor(makeLoggingInterceptor(true))
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build()
    }

    private fun makeLoggingInterceptor(isDebug: Boolean): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = if (isDebug) {
            HttpLoggingInterceptor.Level.BODY

        } else {

            HttpLoggingInterceptor.Level.NONE

        }

        return logging
    }

}