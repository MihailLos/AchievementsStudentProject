package com.example.achievementsstudent.activities

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.achievementsstudent.R

@Composable
fun LoginActivity() {
    Scaffold() {
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
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(21.dp))
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Логин Eios") },
                        modifier = Modifier
                            .width(366.dp)
                            .height(46.dp)
                            .background(Color(0xfff3f2f2))
                            .border(BorderStroke(1.dp, Color(0xFFC4C4C4))),
                        shape = RoundedCornerShape(10.dp)
                    )
                    Spacer(modifier = Modifier.height(21.dp))
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Пароль") },
                        modifier = Modifier
                            .width(366.dp)
                            .height(46.dp)
                            .background(Color(0xfff3f2f2))
                            .border(BorderStroke(1.dp, Color(0xFFC4C4C4))),
                        shape = RoundedCornerShape(10.dp)
                    )
                    Spacer(modifier = Modifier.height(21.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                        modifier = Modifier
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(
                                        Color(0xFFFFBC89),
                                        Color(0xFFFF9A67)
                                    )
                                )
                            )
                            .width(366.dp)
                            .height(46.dp)
                            .shadow(6.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(text = "Войти", color = Color.White)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun LoginActivityPreview() {
    LoginActivity()
}