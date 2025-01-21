package edu.msudenver.cs3013.stylehelloworld

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //var text = findViewById<TextView>(R.id.firstID)
        //text.setText("This is a re-write");
        //text.setBackgroundColor(Color.rgb(255, 255, 0))
    }
}