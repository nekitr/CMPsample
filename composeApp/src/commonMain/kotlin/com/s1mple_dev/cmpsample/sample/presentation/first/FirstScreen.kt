package com.s1mple_dev.cmpsample.sample.presentation.first

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.s1mple_dev.cmpsample.app.NavigationCommand
import com.s1mple_dev.cmpsample.app.Route


@Composable
fun FirstScreenRoot(
    navController: NavHostController,
    state: FirstState,
    onEvent: (FirstEvent) -> Boolean,
    viewModel: FirstScreenViewModel
) {

    LaunchedEffect(Unit) {
        viewModel.navigationCommand.collect { command ->
            when (command) {
                is NavigationCommand.Inner.SecondNavigation -> {
                    navController.navigate(Route.FileDetailsRoute("TEst"))
                }

                else -> {
                    // Handle other navigation commands if needed
                }
            }
        }
    }

    FirstScreen(
        navController = navController,
        state = state,
        onEvent = onEvent,
        viewModel = viewModel
    )
}

@Composable
fun FirstScreen(
    navController: NavHostController,
    state: FirstState,
    onEvent: (FirstEvent) -> Boolean,
    viewModel: FirstScreenViewModel
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = {
                onEvent.invoke(FirstEvent.NavigateTo(NavigationCommand.Inner.SecondNavigation))
            }
        ) {
            Text(
                text = "First screen",
                style = MaterialTheme.typography.headlineLarge,
            )
        }
    }
}