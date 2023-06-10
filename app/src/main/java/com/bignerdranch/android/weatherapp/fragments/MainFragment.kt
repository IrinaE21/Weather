package com.bignerdranch.android.weatherapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.weatherapp.R
import com.bignerdranch.android.weatherapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}