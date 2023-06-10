package com.bignerdranch.android.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    //храним и обновляем информацию для карточки(главное окно)
    val liveDataCurrent = MutableLiveData<String>()
    //храним список с погнозом погоды на ближащие дни
    val liveDataList = MutableLiveData<List<String>>()

}