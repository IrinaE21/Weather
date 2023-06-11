package com.bignerdranch.android.weatherapp.fragments

import android.Manifest
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.bignerdranch.android.weatherapp.R
import com.bignerdranch.android.weatherapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var plauncher: ActivityResultLauncher<String>
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkPermission()
    }


    private fun permissionListener() {
        plauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()) {
            Toast.makeText(activity, "Разрешение is $it", Toast.LENGTH_LONG).show()

        }
    }

    private fun checkPermission(){
        if(!isPermissionGranted(Manifest.permission.ACCESS_FINE_LOCATION)){
            permissionListener()
            plauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)

        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}