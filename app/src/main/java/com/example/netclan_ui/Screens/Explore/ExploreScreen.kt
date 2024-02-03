package com.example.netclan_ui.Screens.Explore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterAlt
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.isPopupLayout
import androidx.navigation.NavController
import androidx.navigation.PopUpToBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.netclan_ui.Data
import com.example.netclan_ui.Screens.Refine.RefineScreen
import com.example.netclan_ui.Screens.TopBar
import com.example.netclan_ui.ui.theme.ColorofIcon
import kotlin.math.absoluteValue


@Composable
fun ExploreScreen(navController: NavController ) {
    var screen1 by remember {
        mutableStateOf(1)
    }
    var screen2 by remember {
        mutableStateOf(0)
    }
    var screen3 by remember {
        mutableStateOf(0)
    }

    if(Data.RefineScreenOpen.value == 1){
        RefineScreen(modifier = Modifier)
    }
    else {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            TopBar(name = "Explore", location = "San Francisco , California", modifier = Modifier)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0XFF153e5a))
                    .padding(top = 14.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Individual",
                    fontSize = 17.sp,
                    color = Color.White,
                    modifier = Modifier.clickable {
                        screen1 = 1
                        screen2 = 0
                        screen3 = 0
                    }
                )
                Text(text = "Professional",
                    fontSize = 17.sp,
                    color = Color.White,
                    modifier = Modifier.clickable {
                        screen1 = 0
                        screen2 = 1
                        screen3 = 0
                    }
                )
                Text(text = "Merchant",
                    fontSize = 17.sp,
                    color = Color.White,
                    modifier = Modifier.clickable {
                        screen1 = 0
                        screen2 = 0
                        screen3 = 1
                    }
                )
            }
            if (screen1 == 1) {
                IndividualScreen()
            } else if (screen2 == 1) {
                ProfessionalScreen()
            } else {
                MerchantScreen()
            }
        }
    }

}



