package com.s1mple_dev.cmpsample.core.presentation

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun AppTypography() = Typography(
    displayLarge = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 57.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ),
    displayMedium = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 45.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 52.sp
    ),
    displaySmall = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 36.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 44.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 32.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 40.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 28.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 36.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 24.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 32.sp
    ),
    titleLarge = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 20.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 28.sp
    ),
    titleMedium = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 16.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    titleSmall = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 14.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelLarge = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 14.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 12.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 11.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 16.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 14.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = MontserratFamily(),
        fontSize = 12.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),
)