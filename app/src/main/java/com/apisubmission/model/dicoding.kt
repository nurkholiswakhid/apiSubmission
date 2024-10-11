package com.apisubmission.model

data class dicoding(
    val error: Boolean,
    val listEvents: List<Events>,
    val message: String
)