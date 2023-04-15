package com.example.gr2_hw_5

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.iman_tulenaliev_hw_5_2.remote.LoveModel
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoveViewModel @Inject constructor(
    private val repository: Repository,
    private val preferences: SharedPreferences
) : ViewModel() {

    fun getLiveLoveModel(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getPercentage(firstName, secondName)
    }
    fun isSecondBoarding(){
        preferences.edit().putBoolean("isFirst", true).apply()
    }

}