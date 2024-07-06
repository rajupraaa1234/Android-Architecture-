package com.example.androidarchitecture.model.repository

import com.example.androidarchitecture.model.usermodel.User


class UserRepository {
    fun getUser(userId: Int): User {
        // Simulate network or database operation
        return User(userId, "John Doe")
    }
}