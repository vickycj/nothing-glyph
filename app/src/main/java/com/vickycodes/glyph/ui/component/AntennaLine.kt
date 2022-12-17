package com.vickycodes.glyph.ui.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
internal fun AntennaLine() {

    Column() {
        Canvas(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)) {

            val canvasWidth = size.width
            val canvasHeight = size.height

            drawLine(
                brush = SolidColor(Color.Black),
                start = Offset(x = canvasWidth, y = 0f),
                end = Offset(x = canvasWidth / 2, y = canvasHeight),
                strokeWidth = 35f
            )
        }
    }
}

@Preview
@Composable
private fun PreviewAntennaLine() {
    AntennaLine()
}