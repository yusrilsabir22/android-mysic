package com.blondev.mysic.datasource

import com.blondev.mysic.models.Playlist
import com.blondev.mysic.models.Song
import com.blondev.mysic.models.Thumbnail

object DataSource {

    fun homeDataSet(): Playlist {
        run {
            val thumbnails: ArrayList<Thumbnail> = ArrayList()

            thumbnails.add(
                Thumbnail(
                    "",
                    720,
                    720
                )
            )

            val songs: ArrayList<Song> = ArrayList()
            songs.add(
                Song(
                    "1",
                    "title-1",
                    "subtitle-2",
                    thumbnails
                )
            )

            return Playlist(
                "song",
                "song",
                songs
            )
        }
    }

}