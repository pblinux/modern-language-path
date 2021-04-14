package com.example.modernlanguagepath

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.modernlanguagepath.ui.theme.ModernLanguagePathTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModernLanguagePathTheme {
                Surface(color = MaterialTheme.colors.background) {
                    SampleApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun SampleApp() {
    val sampleText =
        "Hi! I'm a sample text to show the possibilities of declarative UI \uD83D\uDE04\uD83E\uDD13"

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Yellow,
                title = { Text("Modern languages path") }
            )
        }
    ) {
        Text(
            text = sampleText, modifier = Modifier.padding(16.dp),
            style = TextStyle(
                color = Color.Black,
                fontSize = 64.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Medium,
            ),
        )
    }
}