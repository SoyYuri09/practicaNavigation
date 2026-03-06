package yuri.garcia.navigationcompose_garciayuri.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import yuri.garcia.navigationcompose_garciayuri.navigation.AppNavigator

@Composable
fun LoginScreen(onClickLogin: () -> Unit){ //Fuinción anónima para que solo se ejecute el controlador
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Pantalla de Inicio de Sesión")
        Button(
            onClick = {}
        ) {
            Text(text = "Ingresar al Listado")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(onClickLogin = {})
}