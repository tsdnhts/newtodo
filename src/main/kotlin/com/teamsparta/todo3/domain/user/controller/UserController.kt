package com.teamsparta.todo3.domain.user.controller

import com.teamsparta.todo3.domain.user.dto.SignUpRequest
import com.teamsparta.todo3.domain.user.dto.UpdateUserProfileRequest
import com.teamsparta.todo3.domain.user.dto.UserResponse
import com.teamsparta.todo3.domain.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController

class UserController(
    private val userService: UserService
){
    @PostMapping("/signup")
    fun signUp(@RequestBody signUpRequest : SignUpRequest) : ResponseEntity<UserResponse>{
        return ResponseEntity.
        status(HttpStatus.OK)
        .body(userService.signup(signUpRequest))
    }

    @PutMapping("users/{userId}/profile")
    fun updateUserprofile(@PathVariable userId : Long,
                          @RequestBody updateUserprofileRequest : UpdateUserProfileRequest
    ) : ResponseEntity<UserResponse>{
        return ResponseEntity
            .status((HttpStatus.OK))
            .body((userService.updateUserProfile(userId, updateUserprofileRequest)))
    }
}