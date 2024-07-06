package com.example.androidarchitecture.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidarchitecture.model.repository.UserRepository
import com.example.androidarchitecture.model.usermodel.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {

    private val _user = MutableStateFlow<User?>(null)
    val user: StateFlow<User?> get() = _user

    fun loadUser(userId: Int) {
        viewModelScope.launch {
            val user = userRepository.getUser(userId)
            _user.value = user
        }
    }
}
