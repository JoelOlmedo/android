package com.example.androidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidapp.ui.theme.AndroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column() {

                        PrintToScreen("juel")
                        PrintToScreen("fsdf")
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    val names = listOf("asda","sada","sada")

                    for(name in names){

                        PrintToScreen(name)
                    }
                }
            }
        }
    }
}

@Composable
fun PrintToScreen(name: String?, modifier: Modifier = Modifier) {


    Text(
        text = "Hello ${name}!",
        modifier = modifier
    )
}