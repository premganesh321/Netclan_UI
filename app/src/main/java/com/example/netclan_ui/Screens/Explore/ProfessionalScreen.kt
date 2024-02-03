package com.example.netclan_ui.Screens.Explore

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
fun ProfessionalScreen( ) {

        val g1 = painterResource(id = R.drawable.g1)
        val g2 = painterResource(id = R.drawable.g2)
        val g3 = painterResource(id = R.drawable.g3)
        val g4 = painterResource(id = R.drawable.g4)
    Box(modifier = Modifier.fillMaxWidth()
        , contentAlignment = Alignment.Center
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
                CardLayoutProfessional(
                    name = "Ava Maura",
                    imageofPerson = g1,
                    location = "Berlin , within 2 kms",
                    profession ="Lawyer" ,
                    Expericence = "7 yrs of Experience" ,
                    BrodcastMessage = "Hi community ! I am open to new connections"
                )
                CardLayoutProfessional(
                    name = "Emma Kinski",
                    imageofPerson = g2,
                    location = "Berlin , within 2 kms",
                    profession ="Photographer" ,
                    Expericence = "3 yrs of Experience" ,
                    BrodcastMessage = "Hi community ! I am open to new connections"
                )
                CardLayoutProfessional(
                    name = "Arye Bothi",
                    imageofPerson = g3,
                    location = "Berlin , within 2 kms",
                    profession ="Doctor" ,
                    Expericence = "4 yrs of Experience" ,
                    BrodcastMessage = "Hi community ! I am open to new connections"
                )
                CardLayoutProfessional(
                    name = "Merry Caltoni",
                    imageofPerson = g4,
                    location = "Berlin , within 2 kms",
                    profession ="Teacher" ,
                    Expericence = "7 yrs of Experience" ,
                    BrodcastMessage = "Hi community ! I am open to new connections"
                )
            }
        }
    }

