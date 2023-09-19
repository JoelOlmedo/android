package com.example.androidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                    PrintToScreen("juel","dsf")
                }
            }
        }
    }
}

@Composable
fun PrintToScreen(name: String?,name2: String?, modifier: Modifier = Modifier) {

    val name = name ?: run{

        Log.e("NullError", "Name is Null")
        return
    }

    val name2 = name2 ?: run {

        Log.e("NullError", "Name is Null")
        return
    }

    Text(
        text = "Hello ${name}! ${name2}",
        modifier = modifier
    )
}