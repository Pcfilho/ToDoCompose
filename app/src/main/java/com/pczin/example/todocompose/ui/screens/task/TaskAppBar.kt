package com.pczin.example.todocompose.ui.screens.task

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.pczin.example.todocompose.ui.theme.topAppBarBackgroundColor
import com.pczin.example.todocompose.ui.theme.topAppBarContentColor

@Composable
fun TaskAppBar(){

}

@Composable
fun NewTaskAppBar(){
    TopAppBar(
        navigationIcon = {

        },
        title = {
            Text(
                text = "ADD Task",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor

    ) {


    }
}