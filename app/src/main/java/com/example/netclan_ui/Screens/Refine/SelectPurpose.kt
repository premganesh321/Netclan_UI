package com.example.netclan_ui.Screens.Refine

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.netclan_ui.ui.theme.TopBarBackgroundColor

@Composable
fun Purpose(purpose : String) {
    var isButtonClicked by remember {
        mutableStateOf(false)
    }
    OutlinedButton(onClick = { isButtonClicked = !isButtonClicked },
        border = BorderStroke(1.dp , TopBarBackgroundColor),
        shape = RoundedCornerShape(40),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = if (isButtonClicked) Color.White else TopBarBackgroundColor,
        ),
        modifier = Modifier
            .width(127.dp)
            .height(35.dp)
            .padding(horizontal = 13.dp)
            .background(
                color = if (isButtonClicked) TopBarBackgroundColor else Color.White,
            )
    ) {
        Text(text = purpose)
    }
}
