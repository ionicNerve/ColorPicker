package edu.fullerton.fz.cs411.colors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Switch
import androidx.lifecycle.ViewModelProvider


const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var redSwitch: Switch
    private lateinit var greenSwitch: Switch
    private lateinit var blueSwitch: Switch

    private var redSwichPos = false
    private var blueSwichPos = false
    private var greenSwichPos = false

    private lateinit var redSeekBar: SeekBar
    private lateinit var greenSeekBar: SeekBar
    private lateinit var blueSeekBar: SeekBar

    private lateinit var redText: EditText
    private lateinit var greenText: EditText
    private lateinit var blueText: EditText

    val switchClickListener = View.OnClickListener { view: View ->
        val swtch: Switch = (view as Switch)
        swtch.text = this.getString(R.string.red)
        println("whaaa")
    }

    private val colorsViewModel: ColorsViewModel by lazy {
        ViewModelProvider(this)[ColorsViewModel::class.java]

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentredScore = savedInstanceState?.getInt(TAG,0) ?: 0
        colorsViewModel.setScore(currentredScore)


        connectViewColors()
        setupSwitchCallbacks()
        setupTextCallbacks()
        setupSeekBarCallbacks()


        val colorFragment = this.supportFragmentManager.findFragmentById(R.id.primary_frame)
        if (colorFragment == null) {

            val fragment = ColorFrameFragment()
            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.primary_frame, fragment)
                .commit()

        }
        val colorbarsFragment = this.supportFragmentManager.findFragmentById(R.id.secondary_frame)
        if (colorbarsFragment == null) {

            val fragment = ColorBarsFragment()
            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.secondary_frame, fragment)
                .commit()

        }


    }

    private fun connectViewColors() {

        this.redSwitch = this.findViewById(R.id.red_switch)
        this.greenSwitch = this.findViewById(R.id.green_switch)
        this.blueSwitch = this.findViewById(R.id.blue_switch)

        this.redSeekBar = this.findViewById(R.id.seekBar_red)
        this.greenSeekBar = this.findViewById(R.id.seekBar_green)
        this.blueSeekBar = this.findViewById(R.id.seekBar_blue)

        this.redText = this.findViewById(R.id.editText_red)
        this.greenText = this.findViewById(R.id.editText_green)
        this.blueText = this.findViewById(R.id.editText_blue)

    }

    private fun setupSwitchCallbacks() {

        this.redSwitch.setOnClickListener(switchClickListener)
        this.greenSwitch.setOnClickListener(switchClickListener)
        this.blueSwitch.setOnClickListener(switchClickListener)
    }
    private fun setupTextCallbacks() {
        this.redText.setOnKeyListener{view: View, k: Int, event: KeyEvent -> Boolean
            println("Text key press detected!: $k :: $event")
            false
        }

    }
    private fun setupSeekBarCallbacks() {
        this.redSeekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(rsb: SeekBar?, progress: Int, fromUser: Boolean) {
                println("Seekbar  has been changed to: ${rsb?.progress}")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

    }
    }