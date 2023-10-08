package boc.hackathon.kubaras

import android.app.Activity
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import boc.hackathon.kubaras.ui.*
import boc.hackathon.kubaras.ui.MainScreen

@Composable
fun SmartSavingsApp() {
    val navController = rememberNavController()

    SmartSavingsNavHost(navController)
}

@Composable
fun SmartSavingsNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") {
            MainScreen(
                onBannerClick = {
                    navController.navigate("onboarding")
                },
            )
        }
        composable(
            route = "onboarding",
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Companion.Up,
                    animationSpec = tween(500)
                )
            }
        ){
            OnboardingScreen {
                navController.navigate("rounding")
            }
        }
        composable(
            route = "rounding",
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
                    animationSpec = tween(500)
                )
            }
        ){
            SmartRoundScreen {
                navController.navigate("risks")
            }
        }
        composable(
            route = "risks",
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
                    animationSpec = tween(500)
                )
            }
        ) {
            RiskScreen {
                navController.navigate("risk-details")
            }
        }
        composable(
            route = "risk-details",
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
                    animationSpec = tween(500)
                )
            }
        ){
            RiskDetailsScreen {
                navController.navigate("account")
            }
        }
        composable(
            route = "account",
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
                    animationSpec = tween(500)
                )
            }
        ){
            AccountScreen()
        }
    }
}