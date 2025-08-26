package com.s1mple_dev.cmpsample.core.presentation


import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import cmpsample.composeapp.generated.resources.Res
import cmpsample.composeapp.generated.resources.montserrat_light
import cmpsample.composeapp.generated.resources.montserrat_medium
import cmpsample.composeapp.generated.resources.montserrat_regular
import cmpsample.composeapp.generated.resources.montserrat_semibold
import org.jetbrains.compose.resources.Font

@Composable
fun MontserratFamily() = FontFamily(
    Font(Res.font.montserrat_light, FontWeight.Light),
    Font(Res.font.montserrat_regular, FontWeight.Normal),
    Font(Res.font.montserrat_medium, FontWeight.Medium),
    Font(Res.font.montserrat_semibold, FontWeight.SemiBold),
)
