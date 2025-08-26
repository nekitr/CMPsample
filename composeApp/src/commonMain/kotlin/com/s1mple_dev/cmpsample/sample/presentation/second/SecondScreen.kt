package com.s1mple_dev.cmpsample.sample.presentation.second

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController


@Composable
fun SecondScreenRoot(
    navController: NavHostController,
    state: SecondState,
    onEvent: (SecondEvent) -> Boolean,
    viewModel: SecondScreenViewModel
) {
    SecondScreen(
        navController = navController,
        state = state,
        onEvent = onEvent,
        viewModel = viewModel
    )
}

@Composable
fun SecondScreen(
    navController: NavHostController,
    state: SecondState,
    onEvent: (SecondEvent) -> Boolean,
    viewModel: SecondScreenViewModel
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = {
                navController.popBackStack()
            }
        ) {
            Text(
                text = "Second screen"
            )
        }
    }
}