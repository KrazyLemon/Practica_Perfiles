package com.example.practicaperfiles

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun ScreenA(navController: NavHostController) {
    val image = painterResource(R.drawable.welcome)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text="Menu",
            fontSize = 32.sp,
            modifier = Modifier.height(35.dp)
        )
        Text(
            text="Practica Perfiles",
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.height(100.dp))
        Box(modifier = Modifier){
            Image(
                painter = image,
                contentDescription = null
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Button(
                onClick = {
                    navController.navigate("B")
                },
            ){
                Text(
                    text = "Ventana Uno",
                    fontSize = 14.sp)
            }
            Button(
                onClick = {
                    navController.navigate("C")
                },
            ){
                Text(
                    text = "Ventana Dos",
                    fontSize = 14.sp
                )
            }
        }

        Text(
            modifier = Modifier.padding(0.dp,30.dp),
            text = "Hecho por Angel Eduardo Velazquez Morales",
            fontSize = 12.sp
        )

    }
}