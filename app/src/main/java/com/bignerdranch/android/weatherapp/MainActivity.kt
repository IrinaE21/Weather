package com.bignerdranch.android.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.weatherapp.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //В Мэин активити открывается наш фрагмент, в котором мы и будем дальше работать
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()

    }
}