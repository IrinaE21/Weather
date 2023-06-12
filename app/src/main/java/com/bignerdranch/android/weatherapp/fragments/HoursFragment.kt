package com.bignerdranch.android.weatherapp.fragments

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bignerdranch.android.weatherapp.R
import com.bignerdranch.android.weatherapp.adapters.WeatherAdapter
import com.bignerdranch.android.weatherapp.adapters.WeatherModel
import com.bignerdranch.android.weatherapp.databinding.FragmentHoursBinding


class HoursFragment : Fragment() {

    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private  fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel("", "12 00", "Sunny2", "25CC",
                "", "", "", ""),
            WeatherModel("", "13 00", "Sunny3", "30CC",
                "", "", "", ""),
            WeatherModel("", "16 00", "Sunny5", "50CC",
                "", "", "", ""),
        )
        adapter.submitList(list)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}