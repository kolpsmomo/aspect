package com.aspectseries.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    @Composable
    @Preview(showSystemUi = true, showBackground = true)
    fun MainScreen() {
        AspectTheme {
            Scaffold { innerPadding ->
                Column(Modifier.padding(innerPadding)) {
                    Column {
                        Text("column1")
                        Text("column2")
                        Text("column3")
                        Text("column4")
                        Text("column5")
                        Text("column6")

                        Button(onClick = {
                            println("tewszdtestgserghsehgf;nersbuiseafb sr")
                        }) {
                            Text("test")
                        }
                    }

                    Row {
                        Text("row1")
                        Text("row2")
                        Text("row3")
                        Text("row4")
                        Text("row5")
                        Text("row6")
                    }
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}