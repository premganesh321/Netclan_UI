package com.example.netclan_ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netclan_ui.Data
import com.example.netclan_ui.Screens.Refine.RefineScreen
import com.example.netclan_ui.ui.theme.ColorofIcon
import com.example.netclan_ui.ui.theme.TopBarBackgroundColor

@Composable
fun TopBarOfRefine(name : String, modifier: Modifier) {
    Row (

        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(color = TopBarBackgroundColor),
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(imageVector = Icons.Default.ArrowBackIos,
            contentDescription = "BackArrow",
            modifier = Modifier
                .padding(start = 12.dp)
                .size(30.dp)
                .weight(0.5f)
                .clickable {
                    Data.RefineScreenOpen.value = 0
                },
            colorFilter = ColorFilter.tint(ColorofIcon),
            alignment = Alignment.TopStart,
        )
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .weight(3.5f)
                .padding(start = 15.dp),
            verticalArrangement = Arrangement.Center
        ){
            Text(text = name,
                modifier = Modifier
                    .fillMaxWidth(),
                color = ColorofIcon,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )

        }
    }
}