package com.example.netclan_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatLineSpacing
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.netclan_ui.Screens.Explore.ExploreScreen
import com.example.netclan_ui.Screens.Explore.PrevOfCardLayout
import com.example.netclan_ui.Screens.Explore.PrevOfCardMerchant
import com.example.netclan_ui.Screens.Explore.PrevOfCardProff
import com.example.netclan_ui.ui.theme.ColorofIcon
import com.example.netclan_ui.ui.theme.Netclan_UITheme
import com.example.netclan_ui.ui.theme.TopBarBackgroundColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Netclan_UITheme {
                ExploreScreen(navController = NavController(this) )
               }
            }
        }
    }

