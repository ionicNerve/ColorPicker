package edu.fullerton.fz.cs411.colors

import android.util.Log
import androidx.lifecycle.ViewModel

private const val LOG_TAG = "ColorsViewModel"

class ColorsViewModel: ViewModel() {

    private var red_score = 0
    private var blue_score = 0
    private var green_score = 0

    override fun onCleared() {
        super.onCleared()
        Log.d(LOG_TAG, "ColorsView model to be destroyed")
    }

    fun color_shift(base: Int) {
        this.red_score += 1
    }

    fun getScore(): Int {
        return red_score
    }


}