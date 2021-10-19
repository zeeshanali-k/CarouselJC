package com.carouseljc.models

//Click link: if you want to direct user to some link
data class CarouselItem(
    val id:Int? = 0,
    val url: String,
    val clickLink: String? = null
)