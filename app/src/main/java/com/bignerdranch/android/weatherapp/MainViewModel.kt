package com.bignerdranch.android.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bignerdranch.android.weatherapp.adapters.WeatherModel

class MainViewModel : ViewModel() {
    //храним и обновляем информацию для карточки(главное окно)
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    //храним список с погнозом погоды на ближащие дни
    val liveDataList = MutableLiveData<List<WeatherModel>>()

}