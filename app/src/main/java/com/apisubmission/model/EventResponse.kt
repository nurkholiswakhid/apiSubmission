package com.apisubmission.model

import com.google.gson.annotations.SerializedName

data class EventResponse(
    @SerializedName("events") val events: List<Event>
)

data class Event(
    @SerializedName("id") val id: String,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("date") val date: String,
    @SerializedName("location") val location: String,
    @SerializedName("imageUrl") val imageUrl: String,
    @SerializedName("active") val active: Boolean
)
