package com.example.netclan_ui.Screens.Refine

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldMessage(){
    var userEnteredText by remember {
        mutableStateOf("Hi Community ! I met with an accident and need immediate help")
    }
    var maxChar = 105
    TextField(value = userEnteredText,
        onValueChange = {
            if(it.length <= maxChar){
                userEnteredText = it
            }
        },
        shape = RoundedCornerShape(   22),
        modifier = Modifier
            .padding(start = 20.dp, top = 4.dp, end = 12.dp)
            .fillMaxWidth()
            .height(90.dp)
            .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(22)),

    )
}