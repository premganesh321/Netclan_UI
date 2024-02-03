package com.example.netclan_ui.Screens.Refine

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netclan_ui.Screens.TopBarOfRefine
import com.example.netclan_ui.ui.theme.FontColor

@Composable
fun RefineScreen(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        TopBarOfRefine(name ="Refine", modifier = Modifier)
        Text(
            text = "Select Your Status",
            fontSize = 17.sp,
            color = FontColor,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(top = 20.dp , start = 20.dp)
        )
        DropDown()
        Spacer(modifier = Modifier.height(23.dp))
        Box(
            modifier = Modifier
                .padding(start = 20.dp)
                .background(Color.LightGray)
                .fillMaxWidth(.9f)
                .height(1.dp)
        )
        Spacer(modifier = Modifier.height(23.dp))
        Text(
            text = "Broadcast Brief Message",
            fontSize = 17.sp,
            color = FontColor,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(start = 20.dp)
        )
        TextFieldMessage()
        Spacer(modifier = Modifier.height(23.dp))
        Box(
            modifier = Modifier
                .padding(start = 20.dp)
                .background(Color.LightGray)
                .fillMaxWidth(.9f)
                .height(1.dp)
        )
        Spacer(modifier = Modifier.height(23.dp))
        Text(
            text = "Select Nearby Distance",
            fontSize = 17.sp,
            color = FontColor,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(start = 20.dp)
        )
        DragToSetDistance()
        Spacer(modifier = Modifier.height(23.dp))
        Box(
            modifier = Modifier
                .padding(start = 20.dp)
                .background(Color.LightGray)
                .fillMaxWidth(.9f)
                .height(1.dp)
        )
        Spacer(modifier = Modifier.height(23.dp))
        Text(
            text = "Select Purpose",
            fontSize = 17.sp,
            color = FontColor,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(13.dp))
        Column (
            modifier = Modifier.padding(start = 20.dp , end = 13.dp)
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                Purpose(purpose = "Coffee")
                Purpose(purpose = "Business")
                Purpose(purpose = "Hobbies")
            }
            Spacer(modifier = Modifier.height(17.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                Purpose(purpose = "Friendship")
                Purpose(purpose = "Movies")
                Purpose(purpose = "Dining")
            }
            Spacer(modifier = Modifier.height(17.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Purpose(purpose = "Dating")
                Spacer(modifier = Modifier.width(10.dp))
                Purpose(purpose = "Matrimony")
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(200.dp)
                .height(40.dp)
        ) {
            Text(text = "Save and Explore")
        }

    }
}