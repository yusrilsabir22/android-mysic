package com.blondev.mysic.models

data class Playlist(
    val section: String,
    val type: String,
    val contents: ArrayList<Song>
) {
}