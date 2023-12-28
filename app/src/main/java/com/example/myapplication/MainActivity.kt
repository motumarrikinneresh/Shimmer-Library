package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.shimmer.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier().fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(modifier = Modifier().fillMaxSize()) {
        Box(modifier = Modifier()
            .fillMaxWidth()
            .fillMaxHeight(0.5f))
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MyApplicationTheme {
//        Greeting("Android")
//    }
//}