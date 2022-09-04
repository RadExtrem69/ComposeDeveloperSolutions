package com.example.composeapp

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme
import androidx.compose.foundation.background as background

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}


@Composable
fun CardApp() {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(10F),
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = image,
                contentDescription = "Logo",
                modifier = Modifier
                    .padding(
                        start = 125.dp,
                        end = 125.dp
                    )
            )
            Text(
                text = "Niyas Hameed",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = "App Development Lead",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()

            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .weight(3F)
                .padding(bottom = 50.dp)
        ) {
            Text(
                text = "CONTACT",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 30.dp),
                textAlign = TextAlign.Center,
                color = Color.White)
            ContactCard(image = R.drawable.ic_baseline_call_24, content = "+91 6969 6969")
            ContactCard(image = R.drawable.ic_baseline_email_24, content = "niyasrad@gmail.com")
        }
    }
}

@Composable
fun ContactCard(image: Int, content: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(
                top = 5.dp,
                start = 50.dp,
                end = 50.dp,
            )
            .fillMaxWidth(),
    ) {
        Icon(
            painter = painterResource(id = image),
            contentDescription = "Log",
            tint = Color.White,
            modifier = Modifier
                .weight(0.4F)
        )
        Text(
            text = content,
            color = Color.White,
            fontSize = 18.sp,
            modifier = Modifier
                .weight(0.7F)
        )

    }
}

@Composable
fun ComposeQuadrant() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight(0.5F)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.5F)
                    
            ) {
                SinQuadrant(color = Color.Green, title ="Text composable", para = "Displays text and follows Material Design guidelines.")
            }
            Column() {
                SinQuadrant(color = Color.Yellow, title ="Image composable", para = "Creates a composable that lays out and draws a given Painter class object.")
            }
        }
        Row() {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.5F)
            ) {
                SinQuadrant(color = Color.Cyan, title ="Row composable", para = "A layout composable that places its children in a horizontal sequence.")
            }
            Column() {
                SinQuadrant(color = Color.LightGray, title ="Column composable", para = "A layout composable that places its children in a vertical sequence.")
            }
        }
    }
}

@Composable
fun SinQuadrant(color: Color, title: String, para: String) {
    Column(
        modifier = Modifier
            .background(color)
            .fillMaxSize()
            .wrapContentHeight(Alignment.CenterVertically)
            .padding(16.dp)

    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    bottom = 16.dp
                )
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
        Text(
            text = para,
            textAlign = TextAlign.Justify,
        )


    }
}

@Composable
fun TaskApp() {
    val image = painterResource(id = R.drawable.ic_task_completed)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentHeight(Alignment.CenterVertically)
    ) {
        Image(
            painter = image,
            contentDescription = "Task",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .wrapContentHeight(Alignment.Top)
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(
                    top = 24.dp,
                    bottom = 8.dp,
                )

        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)

        )
    }
}

@Composable
fun JetTutorial(title: String, firstPara: String, secondPara: String) {
    val image = painterResource(id = R.drawable.bg_compose_background)

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = "Jetpack",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(Alignment.Top)
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = firstPara,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )
        Text(
            text = secondPara,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAppTheme {
        //JetTutorial(title = "Jetpack Compose tutorial", firstPara = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", secondPara = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
        //TaskApp()
        //ComposeQuadrant()
        CardApp()
    }
}