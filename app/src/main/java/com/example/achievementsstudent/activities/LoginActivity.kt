package com.example.achievementsstudent.activities

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.saveable.rememberSaveableStateHolder
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.achievementsstudent.R

@Composable
fun LoginActivity() {
    Scaffold(backgroundColor = Color.White) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Image(
                painter = painterResource(id = R.drawable.login_logo),
                contentDescription = "Login screen image",
                modifier = Modifier.weight(1f)
            )
            Column(
                Modifier
                    .fillMaxSize()
                    .weight(2f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Достижения",
                    fontStyle = FontStyle.Normal,
                    fontSize = 24.sp,
                    letterSpacing = 0.07.em,
                    fontWeight = FontWeight.Bold,

                    )
                Spacer(modifier = Modifier.height(21.dp))
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    var username by remember {
                        mutableStateOf("")
                    }
                    var password by remember {
                        mutableStateOf("")
                    }
                    var isPasswordVisible by remember {
                        mutableStateOf(false)
                    }
                    TextField(
                        value = username,
                        onValueChange = { username = it },
                        label = { Text(text = "Логин Eios") },
                        modifier = Modifier
                            .width(366.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(10.dp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = Color(
                                0xfff3f2f2
                            )
                        ),
                        trailingIcon = {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    imageVector = Icons.Filled.Clear,
                                    contentDescription = "Clear icon"
                                )
                            }
                        }
                    )
                    Spacer(modifier = Modifier.height(21.dp))
                    TextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text(text = "Пароль") },
                        modifier = Modifier
                            .width(366.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(10.dp),
                        singleLine = true,
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = Color(
                                0xfff3f2f2
                            )
                        ),
                        visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        trailingIcon = {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    imageVector = if (isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                    contentDescription = "Visibilities icon"
                                )
                            }
                        }
                    )
                    Spacer(modifier = Modifier.height(21.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF9966)),
                        modifier = Modifier
                            .width(366.dp)
                            .height(46.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(text = "Войти", color = Color.White)
                    }
                    TextButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(end = 20.dp)
                    ) {
                        Text(text = "Не получается войти?", color = Color(0xFFFF9966))
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun LoginActivityPreview() {
    MaterialTheme() {
        LoginActivity()
    }
}