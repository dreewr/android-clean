package com.deco.remote.service

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class OkHttpInterceptor : Interceptor{


    override fun intercept(chain: Interceptor.Chain): Response {

        val originalRequest: Request = chain.request()

        val newRequest: Request =

                originalRequest.newBuilder().let{

                    it.build()
                }
             /*   .header("X-AUTH-TOKEN", authToken)
                .header("User-Agent", System.getProperty("http.agent"))*/

        return chain.proceed(newRequest)


    }

}