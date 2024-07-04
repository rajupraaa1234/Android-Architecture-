package com.example.androidarchitecture.model.Login

interface IUser {
    fun getmPassword() : String
    fun getmUsername() : String
    fun isValid() : Boolean
}