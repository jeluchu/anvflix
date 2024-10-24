package com.jeluchu.anvflix.models.search

import kotlinx.serialization.Serializable

@Serializable
data class SearchEntity(
    val foundPages: Int,
    val media: List<SearchResultsEntity>,
    val nextPage: String?,
    val previousPage: String?
)