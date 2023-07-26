package com.blondev.mysic.models

data class Song(
    val videoId: String,
    val title: String?,
    val subtitle: String?,
    val thumbnails: ArrayList<Thumbnail>,
)