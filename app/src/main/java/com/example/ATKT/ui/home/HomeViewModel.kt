package com.example.ATKT.ui.home

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text



    val backgroundColor = MutableLiveData<Int>().apply {
        value=Color.BLUE
    }
}
