package com.pleb.cheese.user.service

import com.pleb.cheese.user.model.User
import java.util.Optional

interface UserService {
    fun createUser(user: User): User
    fun updateUser(id: Long, updatedUser: User): User
    fun findById(id: Long): Optional<User>
}