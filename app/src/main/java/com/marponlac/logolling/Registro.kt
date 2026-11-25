package com.marponlac.logolling

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Registro(modifier: Modifier){
    var usuario by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable {mutableStateOf("") }
    var contraseña by rememberSaveable {mutableStateOf("") }
    var confirmarContraseña by rememberSaveable {mutableStateOf("") }
    Column(modifier.fillMaxSize().background(Color.Black).padding(50.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier.padding(50.dp)) {
            Text("Registro", fontSize = 50.sp, color = Color.White)
        }
        Row() {
            TextField(usuario, onValueChange = {usuario = it},
                label = {Text("Usuario", color = Color.White)},
                colors = TextFieldDefaults.colors(unfocusedContainerColor = Color(0xFF9735A8),
                    focusedContainerColor = Color(0xFF9735A8),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    cursorColor = Color.White
                ))
        }
        Spacer(modifier)
        Row() {
            TextField(email, onValueChange = {email = it},
                label = {Text("Email", color = Color.White)},
                colors = TextFieldDefaults.colors(unfocusedContainerColor = Color(0xFF9735A8),
                    focusedContainerColor = Color(0xFF9735A8),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    cursorColor = Color.White
                ))
        }
        Spacer(modifier)
        Row() {
            TextField(contraseña, onValueChange = {contraseña = it},
                label = {Text("Contraseña", color = Color.White)},
                colors = TextFieldDefaults.colors(unfocusedContainerColor = Color(0xFF9735A8),
                    focusedContainerColor = Color(0xFF9735A8),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    cursorColor = Color.White
                ))
        }
        Spacer(modifier)
        Row() {
            TextField(confirmarContraseña, onValueChange = {confirmarContraseña = it},
                label = {Text("Confirmar contraseña", color = Color.White)},
                colors = TextFieldDefaults.colors(unfocusedContainerColor = Color(0xFF9735A8),
                    focusedContainerColor = Color(0xFF9735A8),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    cursorColor = Color.White
                ))

        }
        Row() {
            Text("Iniciar sesión", color = Color.Cyan)
        }
        Spacer(modifier)
        Row() {
            Button(onClick = {}, modifier = Modifier.background(Color(0xFF9735A8))) {
                Text("Registrarse")
            }
        }

    }
}