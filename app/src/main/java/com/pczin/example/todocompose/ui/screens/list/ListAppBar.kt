package com.pczin.example.todocompose.ui.screens.list

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.pczin.example.todocompose.data.models.Priority
import com.pczin.example.todocompose.ui.theme.topAppBarBackgroundColor
import com.pczin.example.todocompose.ui.theme.topAppBarContentColor

@Composable
fun ListAppBar(){
    DefaultListAppBar(
        onSearchClicked = {}
    )
}

@Composable
fun DefaultListAppBar(
    onSearchClicked: () -> Unit
){
    TopAppBar(
        title = {
            Text(text = "Tasks",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        actions = {
            ListAppBarActions(onSearchClicked = onSearchClicked)
        }
        ,
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor
    )
}

@Composable
fun ListAppBarActions(
    onSearchClicked: () -> Unit
){
    SearchAction(onSearchClicked = onSearchClicked)
}

@Composable
fun SearchAction(
    onSearchClicked: () -> Unit
){
    IconButton(onClick = onSearchClicked) {
        Icon(imageVector = Icons.Filled.Search,
            contentDescription = "Search Tasks",
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}

@Composable
fun SortAction(
    onSortClicked: (Priority) -> Unit
){

}

@Composable
@Preview
private fun DefaultListAppBarPreview(){
    DefaultListAppBar(
        onSearchClicked = {}
    )
}