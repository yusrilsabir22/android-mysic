package com.blondev.mysic.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.blondev.mysic.adapters.PlaylistAdapter
import com.blondev.mysic.databinding.FragmentHomeBinding
import com.blondev.mysic.datasource.DataSource
import com.blondev.mysic.models.Playlist
import com.blondev.mysic.models.Song
import com.blondev.mysic.models.Thumbnail

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        initUI()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initUI() {

        val adapter = PlaylistAdapter(DataSource.homeDataSet())
        binding.homeRcv.setHasFixedSize(true)
        binding.homeRcv.adapter = adapter
    }
}