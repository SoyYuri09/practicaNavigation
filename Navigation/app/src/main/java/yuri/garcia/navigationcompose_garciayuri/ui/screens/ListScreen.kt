package yuri.garcia.navigationcompose_garciayuri.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListScreen(onClick:() -> Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Pantalla Listado")
        Button(
            onClick = {onClick()}
        ) {
            Text(text = "Texto de ejemplo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListScreenPewview(){
    ListScreen(onClick = {})
}