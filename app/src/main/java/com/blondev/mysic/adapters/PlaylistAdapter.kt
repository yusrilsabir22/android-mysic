package com.blondev.mysic.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.blondev.mysic.R
import com.blondev.mysic.models.Playlist

class PlaylistAdapter(private val dataSet: Playlist) : RecyclerView.Adapter<PlaylistAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fragment_song_card, parent, false)
        val holder = ViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return dataSet.contents.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.songImage.setImageURI(Uri.parse(dataSet.contents[position].thumbnails[0].url))
        holder.songTitle.text = dataSet.contents[position].title
        holder.songSubtitle.text = dataSet.contents[position].subtitle
        holder.songDuration.text = ""
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val songImage: ImageView
        val songTitle: TextView
        val songSubtitle: TextView
        val songDuration: TextView

        init {
            songImage = view.findViewById(R.id.song_image)
            songTitle = view.findViewById(R.id.song_title)
            songSubtitle = view.findViewById(R.id.song_subtitle)
            songDuration = view.findViewById(R.id.song_duration)
        }
    }
}