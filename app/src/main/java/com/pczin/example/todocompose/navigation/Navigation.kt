package com.pczin.example.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pczin.example.todocompose.navigation.destinations.listComposable
import com.pczin.example.todocompose.navigation.destinations.taskComposable
import com.pczin.example.todocompose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavtigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}