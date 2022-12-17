package com.vickycodes.glyph.ui.component

import android.widget.Space
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
internal fun ChargerLine() {

    Column() {
        Canvas(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)) {

            val canvasWidth = size.width
            val canvasHeight = size.height

            drawLine(
                brush = SolidColor(Color.Black),
                start = Offset(x =  canvasWidth / 2, y = 0f),
                end = Offset(x = canvasWidth / 2, y = canvasHeight),
                strokeWidth = 35f
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Canvas(modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)) {

            val canvasWidth = size.width
            val canvasHeight = size.height

            drawLine(
                brush = SolidColor(Color.Black),
                start = Offset(x =  canvasWidth / 2, y = 0f),
                end = Offset(x = canvasWidth / 2, y = canvasHeight),
                strokeWidth = 35f
            )
        }
    }

}

@Preview
@Composable
private fun PreviewChargerLine() {
    ChargerLine()
}