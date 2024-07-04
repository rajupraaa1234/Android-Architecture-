package com.example.androidarchitecture.controler.Login

import com.example.androidarchitecture.model.Login.User
import com.example.androidarchitecture.view.ILoginView


class LoginController(private val loginView: ILoginView) : IController {
    override fun onLogin(username: String, password: String) {
        val user = User(username,password)
        if(user.isValid()) {
            loginView.onLoginSuccess("Login Successfully... with ${username} & ${password}")
        }else{
            loginView.onLoginSuccess("Login Failed... with ${username} & ${password}")
        }
    }
}