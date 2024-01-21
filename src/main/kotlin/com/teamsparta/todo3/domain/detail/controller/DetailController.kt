package com.teamsparta.todo3.domain.detail.controller

import com.teamsparta.todo3.domain.detail.dto.AddDetailRequest
import com.teamsparta.todo3.domain.detail.dto.DetailResponse
import com.teamsparta.todo3.domain.detail.dto.UpdateDetailRequest
import com.teamsparta.todo3.domain.title.dto.TitleResponse
import com.teamsparta.todo3.domain.title.service.TitleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/titles/{titleId}/details")
@RestController
class DetailController(
    private val titleService: TitleService
) {

    @GetMapping
    fun getDetailList(@PathVariable titleId: Long): ResponseEntity<List<DetailResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(titleService.getDetailList(titleId))
    }

    @GetMapping("/{detailId}")
    fun getDetail(@PathVariable titleId: Long, @PathVariable detailId: Long): ResponseEntity<DetailResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(titleService.getDetail(titleId, detailId))
    }

    @PostMapping
    fun addDetail(
        @PathVariable titleId: Long,
        @RequestBody addDetailRequest: AddDetailRequest
    ): ResponseEntity<DetailResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(titleService.addDetail(titleId, addDetailRequest))
    }

    @PutMapping("/{detailId}")
    fun updateDetail(
        @PathVariable titleId: Long,
        @PathVariable detailId: Long,
        @RequestBody updateDetailRequest: UpdateDetailRequest
    ): ResponseEntity<DetailResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(titleService.updateDetail(titleId, detailId, updateDetailRequest))
    }

    @DeleteMapping("/{detailId}")
    fun removeDetail(@PathVariable titleId: Long, @PathVariable detailId: Long): ResponseEntity<Unit> {
        titleService.removeDetail(titleId, detailId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }
}