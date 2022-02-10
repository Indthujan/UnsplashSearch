package com.indthudev.imagesearchapp.api

import com.indthudev.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)