package com.jeluchu.anvflix.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeDataEntity(
    @SerialName("alternative_titles")
    val alternativeTitles: List<String>,
    val cover: String,
    val episodes: List<Episode>,
    val genres: List<String>,
    val rating: String,
    val status: String,
    val synopsis: String,
    val title: String,
    val type: String,
    val url: String
)