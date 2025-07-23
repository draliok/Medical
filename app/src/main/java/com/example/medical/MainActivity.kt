package com.example.medical

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val facts = listOf(
        "Did you know? Too much sugar increases the risk of diabetes.",
        "Sleep helps the brain clean itself from toxins.",
        "Drinking water boosts kidney function.",
        "Smoking damages almost every organ in the body.",
        "Vitamin D strengthens your immune system."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = facts.random()
        textView.textSize = 24f
        textView.setPadding(30, 300, 30, 30)
        setContentView(textView)
    }
}
