package com.example.projectcar

import android.util.Log
import javax.inject.Inject

class Benz2 @Inject constructor(
    private val value : Bmw1
) {
    fun benz(){
        Log.d("mohammad","BENZ car")
        value.bmw()
    }
}