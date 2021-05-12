package com.example.viewpager2withtablayout.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager2withtablayout.databinding.FragmentBirdBinding

class BirdFragment : Fragment() {
    private var _binding: FragmentBirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBirdBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}