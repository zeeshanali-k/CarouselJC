package com.carouseljc.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carouseljc.ui.theme.Grey
import com.carouseljc.ui.theme.Typography

@Composable
fun HeaderItem() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {

        Text(
            text = "Top Events",
            style = Typography.h2,
            modifier = Modifier.padding(20.dp)
        )

        Spacer(
            modifier = Modifier
                .height(2.dp)
                .fillMaxWidth()
                .background(Grey)
                .align(Alignment.BottomCenter)
        )
    }

}

@Preview
@Composable
fun ShowHeaderItem() {
    HeaderItem()
}