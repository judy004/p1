package com.example.ttrip
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.p1.ui.theme.P1Theme
import com.example.ttrip.ui.theme.WelcomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContent {
            P1Theme {
                WelcomePage()                }
        }


    }
}

