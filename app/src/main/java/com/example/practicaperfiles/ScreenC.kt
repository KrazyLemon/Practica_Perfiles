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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ScreenC(navController: NavHostController) {
    val image = painterResource(R.drawable.dice)
    val start = 1
    val end = 6
    var numero by remember{
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text="Ventana Dados",
            fontSize = 32.sp,
            modifier = Modifier.height(35.dp)
        )
        Text(
            text="Practica Perfiles",
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = numero,
            fontSize = 24.sp,
            lineHeight = 25.sp,
            modifier = Modifier.padding(0.dp,30.dp),
        )
        Box(modifier = Modifier){
            Image(
                painter = image,
                contentDescription = null
            )
        }

        Button(
            modifier = Modifier.padding(0.dp,30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            onClick = {
                numero = rand(start,end).toString()
                if(numero == "1"){
                    numero = "Tu numero es $numero Felicidades"
                }else{
                    numero = "Te numero es $numero No ganas nada pa"
                }
            }
        ) {
            Text(
                text = "Lanza un Dado",
                fontSize = 32.sp
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
                    navController.navigate("A")
                },
            ){
                Text(
                    text = "Menu",
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

fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}
