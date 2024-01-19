package com.teamsparta.todo3.domain.detail.dto

import java.time.ZonedDateTime

data class AddDetailRequest (
    val id : Long,
    val title : String,
    val description : String?,
    val name : String?,
    val createdAt: ZonedDateTime?= null,
)