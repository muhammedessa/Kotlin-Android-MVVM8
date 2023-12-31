package com.muhammedessa.mypasta.models

import androidx.annotation.Keep

@Keep
data class User(
    val id: Int,
    val name: String,
    val username: String,
    val email: String,
    val company: Company,
    val website: String
)