package com.example.androidarchitecture.model.Login

data class User(val username : String,val password : String) : IUser {
    override fun getmPassword(): String {
        return password
    }

    override fun getmUsername(): String {
       return username
    }

    override fun isValid(): Boolean {
        if (getmUsername().isBlank() && getmPassword().isBlank()) return false
        else return true
    }
}