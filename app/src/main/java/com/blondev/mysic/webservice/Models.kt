package com.blondev.mysic.webservice;

import com.blondev.mysic.models.Playlist

object Models {
    data class Home(
        val data: Playlist,
        val continuation: String
    )
}
