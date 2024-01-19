package com.teamsparta.todo3.domain.title.controller

import com.teamsparta.todo3.domain.title.dto.CreateTitleRequest
import com.teamsparta.todo3.domain.title.dto.TitleResponse
import com.teamsparta.todo3.domain.title.dto.UpdateTitleRequest
import com.teamsparta.todo3.domain.title.service.TitleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/titles")
@RestController
class TitleController(
    private val titleService : TitleService
){

    @GetMapping
    fun getTitleList(): ResponseEntity<List<TitleResponse>>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(titleService.getAllTitleList())
    }

    @GetMapping("/{titleId}")
    fun getTitle(@PathVariable titleId:Long) : ResponseEntity<TitleResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(titleService.getTitleById(titleId))
    }
    @PostMapping
    fun createTitle(@RequestBody createTitleRequest: CreateTitleRequest) : ResponseEntity<TitleResponse>{
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(titleService.createTitle(createTitleRequest))
    }

    @PutMapping("/{titleId}")
    fun updateTitle(
        @PathVariable titleId: Long,
        @RequestBody updateTitleRequest : UpdateTitleRequest
    ): ResponseEntity<TitleResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(titleService.updateTitle(titleId, updateTitleRequest))
    }
    @DeleteMapping("/{titleId}")
    fun deleteTitle(@PathVariable titleId : Long) : ResponseEntity<Unit>{
        titleService.deleteTitle(titleId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }
}