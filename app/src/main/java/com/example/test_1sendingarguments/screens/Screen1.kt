package com.example.test_1sendingarguments.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.test_1sendingarguments.Model
import com.example.test_1sendingarguments.screens.destinations.Screen2Destination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination(start = true)
@Composable
fun Screen1(navigator:DestinationsNavigator) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Button(onClick = {
                navigator.navigate(
                Screen2Destination(
                    model = Model("Amir","Slanbek")
                )
                )
            }) {

            }
        }

    }
    
}