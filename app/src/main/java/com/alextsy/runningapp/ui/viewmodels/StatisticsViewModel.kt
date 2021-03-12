package com.alextsy.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.alextsy.runningapp.repositories.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

    val totalTimeRun = mainRepository.getTotalTImeInMillis()
    val totalDistance = mainRepository.getTotalDistance()
    val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()
    val totalAvgPace = mainRepository.getTotalAvgPace()

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
}