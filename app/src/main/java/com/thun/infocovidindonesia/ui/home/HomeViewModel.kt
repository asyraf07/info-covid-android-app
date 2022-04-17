package com.thun.infocovidindonesia.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.thun.infocovidindonesia.data.CovidApi
import com.thun.infocovidindonesia.data.CovidData
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _covidData = MutableLiveData<CovidData>()
    val covidData: LiveData<CovidData> = _covidData

    init {
            getData()
    }

    private fun getData() {
        viewModelScope.launch {
            try {
                _covidData.value = CovidApi.retrofitService.getCovidData()
            } catch(e: Exception) {
                Log.d("ASYRAF", "${e.message}")
            }

        }
    }

    fun updateData() {
        getData()
    }

}