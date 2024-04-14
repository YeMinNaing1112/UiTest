package com.yeminnaing.interviewtest.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.yeminnaing.interviewtest.R

val Roboto = FontFamily(
    fonts = listOf(
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_bold, FontWeight.Bold),
        Font(R.font.roboto_thin, FontWeight.Thin),
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    displaySmall = TextStyle(
        fontSize = 24.sp,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        lineHeight = 36.sp,
    ),
    displayMedium = TextStyle(
        fontSize = 32.sp,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        lineHeight = 48.sp,
    ),
    bodySmall = TextStyle(
        fontSize = 14.sp,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        lineHeight = 21.sp,
    ),
    bodyMedium = TextStyle(
        fontSize = 16.sp,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
    ),
    labelSmall = TextStyle(
        fontSize = 13.sp,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        lineHeight = 19.sp,
    ),
    titleMedium = TextStyle(
        fontSize = 42.sp,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        lineHeight = 50.sp
    ),
    bodyLarge = TextStyle(
        fontSize = 24.sp,
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        lineHeight = 28.sp
    )
)