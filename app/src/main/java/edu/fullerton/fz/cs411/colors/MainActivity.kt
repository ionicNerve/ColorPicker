package edu.fullerton.fz.cs411.colors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    private lateinit var redSwitch: Switch
    private lateinit var greenSwitch: Switch
    private lateinit var blueSwitch: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

            val fragment = ColorFrameFragment()
            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.secondary_frame, fragment)
                .commit()

        }


        this.redSwitch = this.findViewById(R.id.red_switch)
        this.greenSwitch = this.findViewById(R.id.green_switch)
        this.blueSwitch = this.findViewById(R.id.blue_switch)
    }
}