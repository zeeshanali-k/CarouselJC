package com.carouseljc.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.carouseljc.models.CarouselItem

class MainViewModel : ViewModel() {

    private val _items: MutableState<List<CarouselItem>> = mutableStateOf(listOf())
    val items: MutableState<List<CarouselItem>> = _items

    init {
        _items.value = getItemsList()
    }

    private fun getItemsList(): List<CarouselItem> {
        val itemsList = mutableListOf<CarouselItem>()
        itemsList.apply {
            //        Last item duplicate
            add(CarouselItem( url = "https://image.shutterstock.com/image-vector/brochure-template-layout-cover-design-600w-643120261.jpg"))
//            Visible Items
            add(CarouselItem( url = "https://image.shutterstock.com/image-vector/landscape-brochure-design-corporate-business-600w-611587748.jpg"))
            add(CarouselItem( url = "https://image.shutterstock.com/image-vector/brochure-template-layout-cover-design-600w-643120261.jpg"))
            add(CarouselItem( url = "https://image.shutterstock.com/image-vector/landscape-brochure-design-corporate-business-600w-611587748.jpg"))
            add(CarouselItem( url = "https://image.shutterstock.com/image-vector/brochure-template-layout-cover-design-600w-643120261.jpg"))
//        First item duplicate
            add(CarouselItem(url = "https://image.shutterstock.com/image-vector/landscape-brochure-design-corporate-business-600w-611587748.jpg"))

        }
        return itemsList
    }


}