package com.s1mple_dev.cmpsample.app

import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.s1mple_dev.cmpsample.core.presentation.AppTheme
import com.s1mple_dev.cmpsample.sample.presentation.second.SecondScreenRoot
import com.s1mple_dev.cmpsample.sample.presentation.second.SecondScreenViewModel
import com.s1mple_dev.cmpsample.sample.presentation.first.FirstScreenRoot
import com.s1mple_dev.cmpsample.sample.presentation.first.FirstScreenViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    AppTheme {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = Route.MainGraphRoute
        ) {
            navigation<Route.MainGraphRoute>(
                startDestination = Route.MainListRoute
            ) {
                composable<Route.MainListRoute> {
                    val viewModel: FirstScreenViewModel = koinViewModel<FirstScreenViewModel>()
                    val state by viewModel.state.collectAsStateWithLifecycle()

                    FirstScreenRoot(
                        navController = navController,
                        state = state,
                        onEvent = viewModel::process,
                        viewModel = viewModel
                    )
                }

                composable<Route.FileDetailsRoute> {
                    val viewModel: SecondScreenViewModel = koinViewModel<SecondScreenViewModel>()
                    val state by viewModel.state.collectAsStateWithLifecycle()

                    SecondScreenRoot(
                        navController = navController,
                        state = state,
                        onEvent = viewModel::process,
                        viewModel = viewModel
                    )
                }
            }
        }
    }
}