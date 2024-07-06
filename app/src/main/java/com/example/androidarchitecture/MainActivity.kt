package com.example.androidarchitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidarchitecture.model.repository.UserRepository
import com.example.androidarchitecture.ui.theme.AndroidArchitectureTheme
import com.example.androidarchitecture.view.UserScreen
import com.example.androidarchitecture.viewmodel.UserViewModel
import com.example.androidarchitecture.viewmodel.UserViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val userRepository = UserRepository()
            val userViewModel = ViewModelProvider(this, UserViewModelFactory(userRepository))
                .get(UserViewModel::class.java)

            setContent {
                UserScreen(userViewModel)
            }
        }
    }
}

