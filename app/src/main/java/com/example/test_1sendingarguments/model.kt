package com.example.test_1sendingarguments

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Model(
    val name:String="",
    val surname:String=""
):Parcelable
