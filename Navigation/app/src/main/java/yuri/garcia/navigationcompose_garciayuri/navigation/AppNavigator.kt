package yuri.garcia.navigationcompose_garciayuri.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import yuri.garcia.navigationcompose_garciayuri.ui.screens.ListScreen
import yuri.garcia.navigationcompose_garciayuri.ui.screens.LoginScreen

@Composable
fun AppNavigator(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login"){
        composable(route = "login") {
            LoginScreen(onClickLogin = {navController.navigate("list")})
        }
        composable (route = "list"){
            ListScreen(onClick = {navController.navigate("login")})
        }
    }
}
