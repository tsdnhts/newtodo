package com.teamsparta.todo3.domain.user.dto

data class SignUpRequest (
    val email : String,
    val password : String,
    val nickname : String,
    val role : String
)