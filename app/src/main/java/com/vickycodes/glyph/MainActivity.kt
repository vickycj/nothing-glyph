package com.vickycodes.glyph

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.vickycodes.glyph.ui.component.CameraCurve
import com.vickycodes.glyph.ui.component.ChargerCurve
import com.vickycodes.glyph.ui.theme.GlyphTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GlyphTheme {
                // A surface container using the 'background' color from the theme
                CameraCurve()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GlyphTheme {
        Greeting("Android")
    }
}