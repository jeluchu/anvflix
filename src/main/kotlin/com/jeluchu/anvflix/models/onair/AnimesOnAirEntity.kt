package com.jeluchu.anvflix.models.onair

import kotlinx.serialization.Serializable

@Serializable
data class AnimesOnAirEntity(
    val data: List<OnAirEntity>,
    val success: Boolean
)