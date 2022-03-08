
package io.github.jhnplotim.lebenindeutschland.ui.screen.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.jhnplotim.lebenindeutschland.ui.theme.AndroidcomposetemplateTheme

@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel
) {
    val username by loginViewModel.usernameState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = username,
            onValueChange = loginViewModel::onChangeUsername
        )
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = loginViewModel::onClickLogin) {
            Text(text = "Login")
        }
    }
}

@Composable
@Preview
fun LoginScreenPreview() {
    AndroidcomposetemplateTheme {
        TextField(value = "", onValueChange = {})
    }
}