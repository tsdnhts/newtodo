package com.teamsparta.todo3.domain.title.dto

data class UpdateTitleRequest(
    val title : String,
    val description : String?
)