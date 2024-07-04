package com.example.androidarchitecture.view

interface ILoginView {
    fun onLoginSuccess(msg: String)
    fun onLoginError(msg: String)
}