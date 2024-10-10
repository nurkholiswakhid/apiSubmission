package com.apisubmission.api

import com.apisubmission.model.EventResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DicodingApiService {

    @GET("events")
    fun getActiveEvents(
        @Query("active") active: Int = 1 // Default to 1 for active events
    ): Call<EventResponse>

    @GET("events")
    fun getFinishedEvents(
        @Query("active") active: Int = 0 // Default to 0 for finished events
    ): Call<EventResponse>
}
