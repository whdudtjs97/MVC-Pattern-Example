package com.example.mvcpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mvcpattern.Model.Count
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val count = Count()

        val textView = findViewById<TextView>(R.id.textview2)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener {
            count.increase()
            textView.text = "${count.count}"
        }

        button2.setOnClickListener {
            count.discrease()
            textView.text = "${count.count}"
        }
    }
}