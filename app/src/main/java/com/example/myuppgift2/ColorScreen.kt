package com.example.myuppgift2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myuppgift2.ui.theme.MyBackgroundColor

@Composable
fun ColorScreen(color: String, viewModel: SharedViewModel) {
    val counter by viewModel.counter.collectAsState()
    val backgroundColor = when (color) {
        "red" -> Color.Red
        "green" -> Color.Green
        else -> Color.Gray
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = " $counter",
            style = TextStyle(fontSize = 72.sp)
        )
        Box(
            modifier = Modifier
                .size(270.dp)
                .background(backgroundColor)
        )
    }
}