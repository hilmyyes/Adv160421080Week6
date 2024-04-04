package com.example.Adv160421080Week6.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.Adv160421080Week6.databinding.FragmentArtistDetailBinding

class ArtistDetailFragment : Fragment() {
    private lateinit var  binding: FragmentArtistDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentArtistDetailBinding.inflate(inflater, container, false)
        return  binding.root
    }

}