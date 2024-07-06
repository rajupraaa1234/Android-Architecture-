package com.example.androidarchitecture.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidarchitecture.viewmodel.UserViewModel

@Composable
fun UserScreen(userViewModel: UserViewModel = viewModel()) {
    val user by userViewModel.user.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (user != null) {
            Text(text = "User Name: ${user!!.name}")
        } else {
            Text(text = "Loading...")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { userViewModel.loadUser(1) }) {
            Text("Load User")
        }
    }
}
