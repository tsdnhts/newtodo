package com.teamsparta.todo3.domain.user.dto

data class UserResponse (
    val email : String,
    val nickname : String,
    val id : Long,
    val role : String
)
