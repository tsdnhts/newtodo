package com.teamsparta.todo3.domain.user.service

import com.teamsparta.todo3.domain.user.dto.SignUpRequest
import com.teamsparta.todo3.domain.user.dto.UpdateUserProfileRequest
import com.teamsparta.todo3.domain.user.dto.UserResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserServiceImpl : UserService {

    @Transactional
    override fun signup(request: SignUpRequest): UserResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateUserProfile(userId: Long, request: UpdateUserProfileRequest): UserResponse {
        TODO("Not yet implemented")
    }
}