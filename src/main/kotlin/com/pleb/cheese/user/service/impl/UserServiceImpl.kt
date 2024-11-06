package com.pleb.cheese.user.service.impl

import com.pleb.cheese.user.model.User
import com.pleb.cheese.user.repository.UserRepository
import com.pleb.cheese.user.service.UserService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.RuntimeException
import java.util.*

@Service
class UserServiceImpl(
    val userRepository: UserRepository
) : UserService {
    @Transactional
    override fun createUser(user: User): User {
        return userRepository.save(user)
    }

    @Transactional
    override fun updateUser(id: Long, updatedUser: User): User {
        val existingUser = userRepository.findById(id).orElseThrow{RuntimeException("USER NOT FOUND")}

        val targetUser = existingUser.copy(
            username = updatedUser.username,
            password = updatedUser.password,
            name = updatedUser.name,
            currentTarget = updatedUser.currentTarget,
            currentExpenses = updatedUser.currentExpenses
        )
        return userRepository.save(targetUser)
    }

    override fun findById(id: Long): Optional<User> {
        return userRepository.findById(id)
    }
}