package com.arman.loginpage.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(onClickLogin: (String, String) -> Unit, onClickSignin: () -> Unit) {
    var phoneValue by remember { mutableStateOf(TextFieldValue("")) }
    var passwordValue by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "لطفا شماره تلفن خود را وارد کنید ",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "برای ورود به اپلیکیشن ابتدا شماره تماس خود را وارد کنید",
            style = TextStyle(
                fontSize = 15.sp
            )
        )

        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(0.75f)
                .padding(15.dp),
            value = phoneValue,
            onValueChange = {
                if (it.text.length < 12) {

                    phoneValue = it
                }
            },
            shape = RoundedCornerShape(20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )

        Spacer(modifier = Modifier.height((40.dp)))
        Button(
            modifier = Modifier.fillMaxWidth(0.25f),
            shape = RoundedCornerShape(12.dp),
            onClick = { onClickLogin(phoneValue.text, passwordValue.text) },
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            )
        ) {
            Text(
                text = "ورود"
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        TextButton(onClick = { onClickSignin() }) {
            Text(
                text = "عضو نیستید؟ ثبت نام کنید",
                style = TextStyle(
                    fontSize = 10.sp
                )
            )
        }
    }
}