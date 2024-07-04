package com.example.androidarchitecture

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidarchitecture.controler.Login.IController
import com.example.androidarchitecture.controler.Login.LoginController
import com.example.androidarchitecture.ui.theme.AndroidArchitectureTheme
import com.example.androidarchitecture.view.ILoginView
import com.example.androidarchitecture.view.composable.InputComposable

class MainActivity : ComponentActivity(), ILoginView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val controller: IController = LoginController(this)
        setContent {
            AndroidArchitectureTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(innerPadding, controller)
                }
            }
        }
    }

    override fun onLoginSuccess(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    override fun onLoginError(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}


@Composable
fun LoginScreen(innerPadding: PaddingValues, controller: IController) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
    ) {
        InputComposable(label = "Enter Username") { text ->
            username = text
        }
        InputComposable(label = "Enter Password") { text ->
            password = text
        }
        Button(
            onClick = { controller.onLogin(username.toString(), password.toString()) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(text = "Login")
        }
    }
}
