package com.teamsparta.todo3.domain.user.service

import com.teamsparta.todo3.domain.user.dto.SignUpRequest
import com.teamsparta.todo3.domain.user.dto.UpdateUserProfileRequest
import com.teamsparta.todo3.domain.user.dto.UserResponse

interface UserService {

    fun signup(request : SignUpRequest) : UserResponse

    fun updateUserProfile(userId : Long, request : UpdateUserProfileRequest) : UserResponse
}