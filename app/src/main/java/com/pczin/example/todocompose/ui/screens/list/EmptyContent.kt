package com.pczin.example.todocompose.ui.screens.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pczin.example.todocompose.R
import com.pczin.example.todocompose.ui.theme.MediumGray

@Composable
fun EmptyContent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier.size(120.dp),
            painter = painterResource(id = R.drawable.ic_sad_face_24),
            contentDescription = "Sad Face",
            tint = MediumGray
        )
        Text(text = "No Tasks Found.",
        color = MediumGray,
        fontWeight = FontWeight.Bold,
        fontSize = MaterialTheme.typography.h6.fontSize)
    }
}

@Composable
@Preview
private fun EmptyContentPreview(){
    EmptyContent()
}