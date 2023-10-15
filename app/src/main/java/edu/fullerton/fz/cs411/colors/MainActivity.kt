package edu.fullerton.fz.cs411.colors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Switch



class MainActivity : AppCompatActivity() {


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
        val colorBarsFragment = this.supportFragmentManager.findFragmentById(R.id.secondary_frame)
        if (colorBarsFragment == null) {

            val fragment = ColorBarsFragment()
            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.secondary_frame, fragment)
                .commit()

        }


    }

    }