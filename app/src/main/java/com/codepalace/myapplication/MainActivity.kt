package com.codepalace.myapplication


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.ramotion.fluidslider.FluidSlider


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setUpSlider()
    }

    private fun setUpSlider() {

        val slider = findViewById<FluidSlider>(R.id.fluid_slider)
        val text = findViewById<TextView>(R.id.tv_text)


        slider.beginTrackingListener = {
            //Toast.makeText(applicationContext, "Started dragging @ ${slider.position * 100}", Toast.LENGTH_SHORT).show()
        }

        slider.endTrackingListener = {
            //Toast.makeText(applicationContext, "Ended dragging @ ${slider.position * 100}", Toast.LENGTH_SHORT).show()
        }

        slider.positionListener = { pos -> text.text = (pos * 100).toString()}


    }
}