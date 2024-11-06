package com.pleb.cheese.user.repository

import com.pleb.cheese.user.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}