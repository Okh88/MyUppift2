package com.example.myuppgift2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myuppgift2.ui.theme.MyBackgroundColor

@Composable
fun StartScreen(navController: NavController, viewModel: SharedViewModel) { // Ta emot viewModel
    val counter by viewModel.counter.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = " $counter",
            style = TextStyle(fontSize = 72.sp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { viewModel.incrementCounter() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            ),
            shape = RectangleShape,
            modifier = Modifier
                .width(250.dp)
                .height(150.dp)
        ) {
            Text(
                "PLUS",
                color = Color.Black, fontSize = 44.sp
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = { navController.navigate("color/red") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            ),
            shape = RectangleShape,
            modifier = Modifier
                .width(250.dp)
                .height(150.dp)
        ) {
            Text(
                "RÖD",
                color = Color.Black, fontSize = 44.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate("color/green") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green,
                contentColor = Color.White
            ),
            shape = RectangleShape,
            modifier = Modifier
                .width(250.dp)
                .height(150.dp)
        ) {
            Text(
                "GRÖN",
                color = Color.Black, fontSize = 44.sp)
        }
    }
}