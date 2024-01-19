package com.teamsparta.todo3.domain.title.service

import com.teamsparta.todo3.domain.detail.dto.AddDetailRequest
import com.teamsparta.todo3.domain.detail.dto.DetailResponse
import com.teamsparta.todo3.domain.detail.dto.UpdateDetailRequest
import com.teamsparta.todo3.domain.title.dto.CreateTitleRequest
import com.teamsparta.todo3.domain.title.dto.TitleResponse
import com.teamsparta.todo3.domain.title.dto.UpdateTitleRequest

interface TitleService {


    fun getAllTitleList(): List<TitleResponse>
    fun getTitleById(titleId: Long): TitleResponse
    fun createTitle(request: CreateTitleRequest): TitleResponse
    fun updateTitle(titleId: Long, request: UpdateTitleRequest): TitleResponse
    fun deleteTitle(titleId: Long)
    fun getDetailList(titleId: Long) : List<DetailResponse>
    fun getDetail(titleId : Long, detailId : Long) : DetailResponse
    fun addDetail(titleId: Long, request : AddDetailRequest) : DetailResponse
    fun updateDetail(
        titleId: Long,
        detailId: Long,
        request : UpdateDetailRequest
    ) : DetailResponse
    fun removeDetail(
        titleId : Long,
        detailId: Long)
}
