package com.vickycodes.glyph.ui.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
internal fun CameraCurve() {

    Column() {
        Canvas(modifier = Modifier
            .size(100.dp)
            .clipToBounds()) {

            val canvasWidth = size.width
            val canvasHeight = size.height
            drawArc(
                brush = SolidColor(Color.Black),
                startAngle = -180f,
                sweepAngle = 180f,
                useCenter = false,
                style = Stroke(35f)
            )

            drawLine(
                brush = SolidColor(Color.Black),
                start = Offset(x = 0f, y = canvasHeight / 2),
                end = Offset(x = 0f, y = canvasHeight),
                strokeWidth = 35f
            )
        }

        Canvas(modifier = Modifier
            .width(10.dp)
            .height(5.dp)) {

            val canvasWidth = size.width
            val canvasHeight = size.height

            drawLine(
                brush = SolidColor(Color.Black),
                start = Offset(x = 0f, y = 0f),
                end = Offset(x = 0f, y = canvasHeight),
                strokeWidth = 35f
            )
        }

        Canvas(modifier = Modifier
            .size(100.dp)
            .clipToBounds()) {

            val canvasWidth = size.width
            val canvasHeight = size.height


            drawArc(
                brush = SolidColor(Color.Black),
                startAngle = -0f,
                sweepAngle = 180f,
                useCenter = false,
                style = Stroke(35f)
            )

            drawLine(
                brush = SolidColor(Color.Black),
                start = Offset(x = 0f, y = 0f),
                end = Offset(x = 0f, y = canvasHeight / 2),
                strokeWidth = 35f
            )

        }
    }
}

@Preview
@Composable
private fun PreviewCameraCurve() {
    CameraCurve()
}