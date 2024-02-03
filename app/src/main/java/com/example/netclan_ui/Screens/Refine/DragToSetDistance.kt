package com.example.netclan_ui.Screens.Refine

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netclan_ui.ui.theme.TopBarBackgroundColor

@Composable
fun DragToSetDistance() {

    Box(
        modifier = Modifier
            .padding(start = 20.dp)
            .background(Color.LightGray)
            .fillMaxWidth(.9f)
            .height(4.dp)
    ){
        Box(
            modifier = Modifier
                .background(TopBarBackgroundColor)
                .fillMaxWidth(.6f)
                .height(4.dp),
        )
    }
    Row{
        Text(text = "500m" ,
            modifier = Modifier
                .padding(start = 20.dp, top = 7.dp),
            fontSize = 12.sp
        )
        Text(text = "100km" ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 25.dp, top = 7.dp),
            textAlign = TextAlign.Right,
            fontSize = 12.sp
        )
    }
}