package edu.fullerton.fz.cs411.colors

import android.util.Log
import androidx.lifecycle.ViewModel

private const val LOG_TAG = "ColorsViewModel"

class ColorsViewModel: ViewModel() {

    private var redScore = 255
    private var redSwitchPos = true


    override fun onCleared() {
        super.onCleared()
    }

    fun red_inc(base: Int) {
        this.redScore += 1
    }

    fun setRScore(s: Int) {
        redScore = s
    }

    fun getScore(): Int {
        return this.redScore
    }
    fun get_RSw_pos(): Boolean {
        return this.redSwitchPos
    }

    fun flip_rSwitch(){
        redSwitchPos = !redSwitchPos
    }


}