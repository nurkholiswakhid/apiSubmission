package com.apisubmission.model

data class Events(
    val beginTime: String,
    val category: String,
    val cityName: String,
    val description: String,
    val endTime: String,
    val id: Int,
    val imageLogo: String,
    val link: String,
    val mediaCover: String,
    val name: String,
    val ownerName: String,
    val quota: Int,
    val registrants: Int,
    val summary: String
)