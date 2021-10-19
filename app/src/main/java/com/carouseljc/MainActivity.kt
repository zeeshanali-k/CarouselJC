package com.carouseljc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.carouseljc.components.Carousel
import com.carouseljc.components.HeaderItem
import com.carouseljc.components.ListItem
import com.carouseljc.ui.theme.CarouselJCTheme
import com.carouseljc.viewmodels.MainViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.InternalCoroutinesApi

@InternalCoroutinesApi
@ExperimentalPagerApi
class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarouselJCTheme {
                CarouselAndList(mainViewModel)
            }
        }
    }

}

@ExperimentalPagerApi
@InternalCoroutinesApi
@Composable
fun CarouselAndList(mainViewModel: MainViewModel) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
//        Slider
        Carousel(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            mainViewModel.items
        )

        Spacer(modifier = Modifier.height(20.dp))
// List
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(horizontal = 12.dp,vertical = 10.dp)
        ) {
            Card(
                elevation = 4.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                shape = RoundedCornerShape(5.dp)
            ) {
                LazyColumn() {
                    item {
                        HeaderItem()
                    }
                    items(10) {
                        ListItem()
                    }
                }
            }
        }
    }
}

