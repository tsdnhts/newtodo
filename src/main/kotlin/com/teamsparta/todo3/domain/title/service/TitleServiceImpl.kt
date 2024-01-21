package com.teamsparta.todo3.domain.title.service

import com.teamsparta.todo3.domain.detail.dto.AddDetailRequest
import com.teamsparta.todo3.domain.detail.dto.DetailResponse
import com.teamsparta.todo3.domain.detail.dto.UpdateDetailRequest
import com.teamsparta.todo3.domain.exception.dto.ModelNotFoundException
import com.teamsparta.todo3.domain.title.dto.CreateTitleRequest
import com.teamsparta.todo3.domain.title.dto.TitleResponse
import com.teamsparta.todo3.domain.title.dto.UpdateTitleRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service

class TitleServiceImpl : TitleService {
    override fun getAllTitleList(): List<TitleResponse> {
        TODO("Not yet implemented")
    }

    override fun getTitleById(titleId: Long): TitleResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun createTitle(request: CreateTitleRequest): TitleResponse {
        TODO("Not yet implemented")
    }
    @Transactional
    override fun updateTitle(titleId: Long, request: UpdateTitleRequest): TitleResponse {
        TODO("Not yet implemented")
    }
    @Transactional
    override fun deleteTitle(titleId: Long) {
        TODO("Not yet implemented")
    }

    override fun getDetailList(titleId: Long): List<DetailResponse> {
        TODO("Not yet implemented")
    }

    override fun getDetail(titleId: Long, detailId: Long): DetailResponse {
        TODO("Not yet implemented")
    }
    @Transactional
    override fun addDetail(titleId: Long, request: AddDetailRequest): DetailResponse {
        TODO("Not yet implemented")
    }
    @Transactional
    override fun updateDetail(titleId: Long, detailId: Long, request: UpdateDetailRequest): DetailResponse {
        TODO("Not yet implemented")
    }
    @Transactional
    override fun removeDetail(titleId: Long, detailId: Long) {
        TODO("Not yet implemented")
    }
}