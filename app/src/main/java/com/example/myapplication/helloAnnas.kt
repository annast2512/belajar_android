
    package com.example.myapplication

    import android.content.res.Resources
    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.layout.*
    import androidx.compose.material.Text
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.material.Surface
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.text.style.TextAlign

    fun getScreenWidth(): Int {
        return Resources.getSystem().displayMetrics.widthPixels
    }
    fun getScreenHeight(): Int {
        return  Resources.getSystem().displayMetrics.heightPixels
    }

    class helloAnnas : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val surfaceWidth = getScreenWidth() * 0.129;
            val surfaceHeight = getScreenHeight() * 0.188;
            setContent {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Surface(
                            color = Color(0xffc9b6db),
                            modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.popury),
                                    contentDescription = "popury",
                                    alignment = Alignment.Center,
                                    modifier = Modifier.padding(6.dp)
                                )
                                Text(
                                    text = "Popury",
                                    fontSize = 19.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "HarvestMoon Back to Nature",
                                    fontSize = 14.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Surface(
                            color = Color(0xfff4ddbb),
                            modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ann),
                                    contentDescription = "Ann",
                                    alignment = Alignment.Center,
                                    modifier = Modifier.padding(6.dp)
                                )
                                Text(
                                    text = "Ann",
                                    fontSize = 19.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "HarvestMoon Back to Nature",
                                    fontSize = 14.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Surface(
                            color = Color(0xff91abc9),
                            modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.elli),
                                    contentDescription = "Treasure's Logo",
                                    alignment = Alignment.Center,
                                    modifier = Modifier.padding(6.dp)
                                )
                                Text(
                                    text = "Elli",
                                    fontSize = 19.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "HarvestMoon Back to Nature",
                                    fontSize = 14.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Surface(
                            color = Color(0xffd59890),
                            modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.karen),
                                    contentDescription = "karen",
                                    alignment = Alignment.Center,
                                    modifier = Modifier.padding(6.dp)
                                )
                                Text(
                                    text = "Karen",
                                    fontSize = 19.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "HarvestMoon Back to Nature",
                                    fontSize = 14.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Surface(
                            color = Color(0xff91abc9),
                            modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.marry),
                                    contentDescription = "Marry",
                                    alignment = Alignment.Center,
                                    modifier = Modifier.padding(6.dp)
                                )
                                Text(
                                    text = "Marry",
                                    fontSize = 19.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "HarvestMoon Back to Nature",
                                    fontSize = 14.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Surface(
                            color = Color(0xffc9b6db),
                            modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.popury2),
                                    contentDescription = "popury",
                                    alignment = Alignment.Center,
                                    modifier = Modifier.padding(4.dp)
                                )
                                Text(
                                    text = "Popury",
                                    fontSize = 19.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "HarvestMoon Back to Nature",
                                    fontSize = 14.sp,
                                    color = Color.Black,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
        }
    }

//@preview(showbackground = true, showSystemU1)
//@composable
//fun EchoText(){