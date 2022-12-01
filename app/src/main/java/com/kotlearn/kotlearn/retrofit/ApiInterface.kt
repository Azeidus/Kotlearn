package com.kotlearn.kotlearn.retrofit

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    @GET("/posts")
    fun getData() : Call<List<MyDataItem>>


}