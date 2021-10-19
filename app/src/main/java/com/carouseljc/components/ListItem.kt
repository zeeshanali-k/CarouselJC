package com.carouseljc.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carouseljc.R
import com.carouseljc.ui.theme.*

@Composable
fun ListItem() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                Modifier.weight(1.6f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Fri",
                    style = Typography.h1
                )

                Text(
                    text = "OCT 14",
                    style = Typography.h3,
                    modifier = Modifier.padding(2.dp)
                )

                Text(
                    text = "2021",
                    style = Typography.h3
                )

                Spacer(modifier = Modifier.height(10.dp))

                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24),
                    contentDescription = "Add to favourites",
                    tint = FavBtnColor,
                    modifier = Modifier.size(35.dp)
                )

            }

            Spacer(
                modifier = Modifier
                    .height(100.dp)
                    .width(2.dp)
                    .background(DivColor)
            )

            Column(
                Modifier
                    .weight(7f)
                    .padding(vertical = 7.dp, horizontal = 10.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "ST. Louis Cardinal at Chicago Cubs (Rescheduled from July 11 , 2021) Testing",
                    maxLines = 2, overflow = TextOverflow.Ellipsis,
                    style = Typography.h3,
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "7:46 pm . Chicago IL - Wrigley Field",
                    maxLines = 1,
                    style = Typography.h5
                )

                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = "1050 Tickets Left",
                        maxLines = 1,
                        style = Typography.h5
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "From 25$",
                        maxLines = 1,
                        color = PinkColor,
                        style = Typography.h5
                    )
                }


            }
        }
        Spacer(modifier = Modifier
            .height(2.dp)
            .fillMaxWidth()
            .background(Grey)
            .align(Alignment.BottomCenter))
    }
}

@Preview
@Composable
fun ShowListItem() {
    ListItem()
}