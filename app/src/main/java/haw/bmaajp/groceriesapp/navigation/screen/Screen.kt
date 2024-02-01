package haw.bmaajp.groceriesapp.navigation.screen

sealed class Screen(val route: String) {
    object Login : Screen("login_screen")

    object SignUp : Screen("sign_up_screen")

    object Details : Screen("details_screen/{productId}") {
        fun passProductId(productId: Int): String = "details_screen/$productId"
    }

}