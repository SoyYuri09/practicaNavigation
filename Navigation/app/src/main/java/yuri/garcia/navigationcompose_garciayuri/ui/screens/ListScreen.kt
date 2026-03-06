package yuri.garcia.navigationcompose_garciayuri.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Pantalla Listado")
    }
}

@Preview(showBackground = true)
@Composable
fun ListScreenPewview(){
    ListScreen()
}