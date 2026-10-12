package com.example.a25012022005_practical_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.a25012022005_practical_5.ui.theme._25012022005_Practical5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            _25012022005_Practical5Theme {
                AppNavigation()
            }
        }
    }
}