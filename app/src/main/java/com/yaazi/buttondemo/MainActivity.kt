package com.yaazi.buttondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {
    var counter: Int = 0;

    private var tvCounter: TextView? = null
    private var imageView: ImageView? = null
    private var resetBtn: ExtendedFloatingActionButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCounter = findViewById<TextView>(R.id.tvCounter)
        imageView = findViewById<ImageView>(R.id.imageView)
        resetBtn = findViewById<ExtendedFloatingActionButton>(R.id.extended_fab)

        resetBtn?.setOnClickListener(View.OnClickListener {
            counter = 0
            tvCounter?.text = "0"
        });
    }


    fun incrementCounter(view: View) {
        counter++
        tvCounter?.text = counter.toString()


        if (imageView?.drawable?.constantState == ResourcesCompat.getDrawable(
                resources,
                R.drawable.child,
                null
            )?.constantState
        ) {
            imageView?.setImageResource(R.drawable.football)
        } else {
            imageView?.setImageResource(R.drawable.child)
        }
    }
}