package com.teamsparta.todo3.domain.exception.dto

data class ModelNotFoundException(val titleName : String, val id : Long) : RuntimeException(
    "Title $titleName not found with given id : $id"
)