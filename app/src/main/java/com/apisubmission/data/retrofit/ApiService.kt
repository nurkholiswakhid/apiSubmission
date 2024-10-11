package com.apisubmission.data.retrofit

import retrofit2.Call
import retrofit2.http.*
import com.apisubmission.data.response.DicodingResponse

interface ApiService {
    @GET("detail/{id}")
    fun getDicoding(
        @Path("id") id: String
    ): Call<DicodingResponse>
}