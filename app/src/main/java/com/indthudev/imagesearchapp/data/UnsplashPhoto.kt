package com.indthudev.imagesearchapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashPhoto(
 val id: String,
 val description: String?,
 val urls: UnsplashPhotoUrls,
 val user: UnsplashPhotoUsers,

 ) : Parcelable {

    @Parcelize
    data class UnsplashPhotoUrls(
     val raw: String,
     val full: String,
     val regular: String

    ) : Parcelable

    @Parcelize
    data class UnsplashPhotoUsers(
     val name: String,
     val username: String
    ) : Parcelable {
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearchApp&utm_medium=referral"
    }
}