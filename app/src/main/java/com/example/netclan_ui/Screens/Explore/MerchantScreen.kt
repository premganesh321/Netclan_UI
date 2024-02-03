package com.example.netclan_ui.Screens.Explore

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun MerchantScreen( ) {
    val s1 = painterResource(id = R.drawable.s1)
    val s2= painterResource(id = R.drawable.s2)
    val s3 = painterResource(id = R.drawable.s3)
    val s4 = painterResource(id = R.drawable.s4)
    Box(modifier = Modifier.fillMaxWidth()
        , contentAlignment = Alignment.TopEnd
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

            CardLayoutMerchant(
                name = "Nkyaa Store",
                imageofPerson = s1,
                location = " Ontario , within 2 kms",
                BrodcastMessage = "Hi community ! We have a grate deal for you"
            )
            CardLayoutMerchant(
                name = "Makeover Studio",
                imageofPerson = s2,
                location = " Ontario , within 2 kms",
                BrodcastMessage = "Hi community ! We have a grate deal for you"
            )
            CardLayoutMerchant(
                name = "GAP Exclusive Store",
                imageofPerson = s3,
                location = " Ontario , within 2 kms",
                BrodcastMessage = "Hi community ! We have a grate deal for you"
            )
            CardLayoutMerchant(
                name = "Walmart",
                imageofPerson = s4,
                location = " Ontario , within 2 kms",
                BrodcastMessage = "Hi community ! We have a grate deal for you"
            )

        }
    }
}