package com.teamsparta.todo3.domain.user.controller

import com.teamsparta.todo3.domain.user.dto.SignUpRequest
import com.teamsparta.todo3.domain.user.dto.UpdateUserProfileRequest
import com.teamsparta.todo3.domain.user.dto.UserResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController

class UserController {
    @PostMapping("/signup")
    fun signUp(@RequestBody signUpRequest : SignUpRequest) : ResponseEntity<UserResponse>{
        TODO()
    }

    @PutMapping("users/{userId}/profile")
    fun updateuserprofile(@PathVariable userId : Long,
                          @RequestBody updateUserprofileRequest : UpdateUserProfileRequest
    ) : ResponseEntity<UserResponse>{
        TODO()
    }
}