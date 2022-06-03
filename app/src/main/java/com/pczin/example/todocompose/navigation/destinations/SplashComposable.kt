@file:OptIn(ExperimentalAnimationApi::class)

package com.pczin.example.todocompose.navigation.destinations

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import com.pczin.example.todocompose.ui.screens.splash.SplashScreen
import com.pczin.example.todocompose.util.Constants

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit
) {
    composable(
        route = Constants.SPLASH_SCREEN,
        exitTransition = {
            when (targetState.destination.route) {
                ""
            }
        }
    ){
        SplashScreen(
            navigateToListScreen = navigateToListScreen
        )
    }
}