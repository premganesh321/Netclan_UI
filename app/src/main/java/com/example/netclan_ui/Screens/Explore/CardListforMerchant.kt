package com.example.netclan_ui.Screens.Explore

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.PersonAddAlt1
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netclan_ui.R
import com.example.netclan_ui.ui.theme.FontColor
import com.example.netclan_ui.ui.theme.TopBarBackgroundColor

@Composable
fun CardLayoutMerchant(name : String, imageofPerson : Painter, location : String, BrodcastMessage : String) {
    Box {
        Card(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            border = BorderStroke(1.dp, Color.LightGray),
            modifier = Modifier
                .height(250.dp)
                .padding(top = 20.dp , start = 50.dp , end = 20.dp , bottom = 20.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 130.dp, start = 18.dp)
            ) {
                Text(
                    text = BrodcastMessage,
                    color = TopBarBackgroundColor,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 2.dp)
                )
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 40.dp)
        ) {
            Image(
                painter = imageofPerson,
                contentDescription = "ProfilePic",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .padding(start = 13.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 17.dp, start = 20.dp)
            ){
                Text(
                    text = name,
                    color = TopBarBackgroundColor,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = location,
                    color = TopBarBackgroundColor,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Medium,
                )
                Box(
                    modifier = Modifier
                        .background(Color.LightGray)
                        .fillMaxWidth(.6f)
                        .height(8.dp)
                ){
                    Box(
                        modifier = Modifier
                            .background(FontColor)
                            .fillMaxWidth(.6f)
                            .height(8.dp),

                        )
                }
                Row {
                    Image(imageVector = Icons.Default.Call,
                        contentDescription = "Phone",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(20.dp)
                            .background(color = TopBarBackgroundColor, shape = CircleShape),
                        colorFilter = ColorFilter.tint(Color.White) ,
                    )
                    Image(imageVector = Icons.Default.PersonAddAlt1,
                        contentDescription = "Phone",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(20.dp)
                            .background(color = TopBarBackgroundColor, shape = CircleShape),
                        colorFilter = ColorFilter.tint(Color.White) ,
                    )
                    Image(imageVector = Icons.Default.LocationOn,
                        contentDescription = "Phone",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(20.dp)
                            .background(color = TopBarBackgroundColor, shape = CircleShape),
                        colorFilter = ColorFilter.tint(Color.White) ,
                    )
                }

            }

        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PrevOfCardMerchant() {
    val s1 = painterResource(id = R.drawable.s1)
    CardLayoutMerchant(
        name = "GAP Exclusive Store",
        imageofPerson = s1,
        location = " Ontario , within 2 kms",
        BrodcastMessage = "Hi community ! We have a grate deal for you"
    )
}