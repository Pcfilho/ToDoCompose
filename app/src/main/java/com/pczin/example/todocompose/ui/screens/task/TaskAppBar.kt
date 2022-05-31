package com.pczin.example.todocompose.ui.screens.task

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.pczin.example.todocompose.data.models.Priority
import com.pczin.example.todocompose.data.models.ToDoTask
import com.pczin.example.todocompose.ui.theme.topAppBarBackgroundColor
import com.pczin.example.todocompose.ui.theme.topAppBarContentColor
import com.pczin.example.todocompose.util.Action

@Composable
fun TaskAppBar(
    selectedTask: ToDoTask?,
    navigateToListScreen: (Action) -> Unit
){
    if(selectedTask == null) {
        NewTaskAppBar(navigateToListScreen = navigateToListScreen)
    } else{
        ExistingTaskAppBar(
            selectedTask = selectedTask,
            navigateToListScreen = navigateToListScreen
        )
    }
}

@Composable
fun NewTaskAppBar(
    navigateToListScreen: (Action) -> Unit
){
    TopAppBar(
        navigationIcon = {
            BackAction(onBackClicked = navigateToListScreen)
        },
        title = {
            Text(
                text = "Add Task",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,
        actions = {
            AddAction(onAddClicked = navigateToListScreen)

        }
    )
}

@Composable
fun BackAction(
    onBackClicked: (Action) -> Unit
){
    IconButton(onClick = {
        onBackClicked(Action.NO_ACTION)
    }) {
        Icon(imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Back Arrow",
            tint = MaterialTheme.colors.topAppBarContentColor)
    }
}

@Composable
fun AddAction(
    onAddClicked: (Action) -> Unit
){
    IconButton(onClick = { onAddClicked(Action.ADD) }) {
        Icon(imageVector = Icons.Filled.Check,
            contentDescription = "Add Task",
            tint = MaterialTheme.colors.topAppBarContentColor)
    }
}

@Composable
fun ExistingTaskAppBar(
    selectedTask: ToDoTask,
    navigateToListScreen: (Action) -> Unit
){
    TopAppBar(
        navigationIcon = {
            CloseAction(onCloseClicked = navigateToListScreen)
        },
        title = {
            Text(
                text = selectedTask.title,
                color = MaterialTheme.colors.topAppBarContentColor,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,
        actions = {
            DeleteAction(onDeleteClicked = navigateToListScreen)
            UpdateAction(onUpdateClicked = navigateToListScreen)
        }
    )
}

@Composable
fun CloseAction(
    onCloseClicked: (Action) -> Unit
){
    IconButton(onClick = {
        onCloseClicked(Action.NO_ACTION)
    }) {
        Icon(imageVector = Icons.Filled.Close,
            contentDescription = "Close Icon",
            tint = MaterialTheme.colors.topAppBarContentColor)
    }
}

@Composable
fun DeleteAction(
    onDeleteClicked: (Action) -> Unit
){
    IconButton(onClick = {
        onDeleteClicked(Action.DELETE)
    }) {
        Icon(imageVector = Icons.Filled.Delete,
            contentDescription = "Delete Icon",
            tint = MaterialTheme.colors.topAppBarContentColor)
    }
}

@Composable
fun UpdateAction(
    onUpdateClicked: (Action) -> Unit
){
    IconButton(onClick = {
        onUpdateClicked(Action.UPDATE)
    }) {
        Icon(imageVector = Icons.Filled.Check,
            contentDescription = "Update Icon",
            tint = MaterialTheme.colors.topAppBarContentColor)
    }
}

@Preview
@Composable
fun NewTaskAppBarPreview() {
    NewTaskAppBar(navigateToListScreen = {})
}

@Preview
@Composable
fun ExistingTaskAppBarPreview() {
    ExistingTaskAppBar(
        selectedTask = ToDoTask(
            id = 0,
            title = "Teste Task",
            description = "Some Random Text",
            priority = Priority.MEDIUM
        ),
        navigateToListScreen = {}
    )
}