package com.example.mobileapp

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.WHITE)
        }

        val title = TextView(this).apply {
            text = "Привет, Kotlin!"
            textSize = 28f
            setTextColor(Color.rgb(25, 25, 25))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Твой новый Android-проект готов"
            textSize = 16f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 16, 0, 0)
        }

        root.addView(title)
        root.addView(subtitle)
        setContentView(root)
    }
}
