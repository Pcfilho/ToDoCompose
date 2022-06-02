package com.pczin.example.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.pczin.example.todocompose.ui.screens.splash.SplashScreen
import com.pczin.example.todocompose.util.Constants

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit
) {
    composable(
        route = Constants.SPLASH_SCREEN,
    ){
        SplashScreen(
            navigateToListScreen = navigateToListScreen
        )
    }
}