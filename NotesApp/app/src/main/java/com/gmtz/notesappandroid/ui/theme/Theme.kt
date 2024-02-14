package com.gmtz.notesappandroid.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = BoneWhite,
    background = DarkGray,
    onBackground = BoneWhite,
    surface = Color.LightGray,
    onSurface = DarkGray
)

@Composable
fun NoteAppAndroidTheme(content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}