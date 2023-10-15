package edu.fullerton.fz.cs411.colors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Switch
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class ColorBarsFragment: Fragment() {

    private lateinit var colorsViewModel: ColorsViewModel

    private lateinit var redSwitch: Switch
    private lateinit var greenSwitch: Switch
    private lateinit var blueSwitch: Switch

    private lateinit var redSeekBar: SeekBar
    private lateinit var greenSeekBar: SeekBar
    private lateinit var blueSeekBar: SeekBar

    private lateinit var redText: EditText
    private lateinit var greenText: EditText
    private lateinit var blueText: EditText

    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.colorsViewModel = ViewModelProvider(this)[ColorsViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_color_bars, container,false)

        this.redSwitch = view.findViewById(R.id.red_switch)
        this.redSeekBar = view.findViewById(R.id.seekBar_red)
        this.redText = view.findViewById(R.id.editText_red)
        this.resetButton = view.findViewById(R.id.button_reset)

        return view
    }

    override fun onStart() {
        super.onStart()
    }

}
