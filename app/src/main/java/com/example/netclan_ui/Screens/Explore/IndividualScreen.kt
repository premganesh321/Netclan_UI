package com.example.netclan_ui.Screens.Explore

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netclan_ui.R

@Composable
fun IndividualScreen() {
    val p1 = painterResource(id = R.drawable.p1)
    val p2 = painterResource(id = R.drawable.p2)
    val p3 = painterResource(id = R.drawable.p3)
    val p4 = painterResource(id = R.drawable.p4)
    Box(modifier = Modifier.fillMaxWidth()
     , contentAlignment = Alignment.TopStart
    ){
        Box(
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth(0.33f)
                .height(7.dp)
        )
    }
    Spacer(modifier = Modifier.height(20.dp))
    LazyColumn {
        item {
            CardLayout(
                name = "Michael Murphy",
                imageofPerson = p1,
                location = "San Francisco, within 1 km",
                purpose1 = "Friendship",
                purpose2 = "Coffee",
                purpose3 = "Hangout",
                BrodcastMessage = "Hi community! I am open to new connections",
                Request = "Invite"
            )
            CardLayout(
                name = "John Doe",
                imageofPerson = p2,
                location = "San Francisco, within 1 km",
                purpose1 = "Coffee",
                purpose2 = "Movies",
                purpose3 = "Hobbies",
                BrodcastMessage = "Going to Berkley , would love to share a ride with some like minded",
                Request = "Invite"
            )
            CardLayout(
                name = "Jennifer",
                imageofPerson = p3,
                location = "San Francisco, within 1 km",
                purpose1 = "Friendship",
                purpose2 = "Coffee",
                purpose3 = "Hangout",
                BrodcastMessage = "Hi community! I am open to new connections",
                Request = "Invite"
            )
            CardLayout(
                name = "Ravi teja",
                imageofPerson = p4,
                location = "San Francisco, within 1 km",
                purpose1 = "Movies",
                purpose2 = "Coffee",
                purpose3 = "Hangout",
                BrodcastMessage = "Hi community! I am open to new connections",
                Request = "Invite"
            )
        }
    }
}