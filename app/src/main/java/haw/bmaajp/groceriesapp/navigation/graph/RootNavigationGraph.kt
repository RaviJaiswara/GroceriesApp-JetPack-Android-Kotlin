package haw.bmaajp.groceriesapp.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import haw.bmaajp.groceriesapp.navigation.screen.Screen
import haw.bmaajp.groceriesapp.presentation.screen.MainScreen
import haw.bmaajp.groceriesapp.presentation.screen.login.LoginPage
import haw.bmaajp.groceriesapp.presentation.screen.signup.SignUpScreen

@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Screen.Login.route
    ) {
        composable(route = Screen.Login.route) {
            LoginPage(navController = navController)
        }

        composable(Screen.SignUp.route) {
            SignUpScreen(navController = navController)
        }

        composable(route = Graph.MAIN) {
            MainScreen()
        }

    }
}