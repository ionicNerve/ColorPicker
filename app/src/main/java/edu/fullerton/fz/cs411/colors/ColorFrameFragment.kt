package edu.fullerton.fz.cs411.colors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class ColorFrameFragment: Fragment() {

    private lateinit var colorsViewModel: ColorsViewModel

    private lateinit var colorCard: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.colorsViewModel = ViewModelProvider(this)[ColorsViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_color_frame, container,false)

        this.colorCard = view.findViewById(R.id.card_color)

        return view
    }

    override fun onStart() {
        super.onStart()
    }

}