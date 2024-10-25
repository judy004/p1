package com.example.ttrip.ui.theme
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1.R


@Composable
fun WelcomePage() {
    val painter = painterResource(id = R.drawable.intro)
    val description = "first page"

    imageA(painter = painter, contentDescription = description)
}

@Composable
fun imageA(
    painter: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        //BACKGROUND IMAGE
        Image(
            painter = painter,
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        //for the blur effect
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White.copy(alpha = 0.8f))
                .blur(radius = 10.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            //column for (logo, text, Button)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp)
            ) {
                //logo
                val painter1 = painterResource(id = R.drawable.logo)
                logo(painter = painter1 , contentDescription = "logo")

                //the T.TRIP text
                Text(
                    text = "T.TRIP",
                    color = Color.White,
                    fontWeight = FontWeight.W400,
                    fontSize = 55.sp,
                    style = TextStyle(
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(8f, 8f),
                            blurRadius = 8f
                        )
                    ),
                    modifier = Modifier
                        .padding(PaddingValues(horizontal = 8.dp, vertical = 4.dp))
                )

                Spacer(modifier = Modifier.height(95.dp))

                //welcome button
                Button(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .height(70.dp)
                        .border(
                            border = BorderStroke(0.dp, color = Color.White),
                            shape = RoundedCornerShape(13.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF5BC0DE),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = "Welcome To T.TRIP",
                        style = TextStyle(
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            letterSpacing = 2.sp
                        ),
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(50.dp))
            }
        }
    }
}

@Composable
fun logo (
    painter: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier
){
    Image(
        painter = painter,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(350.dp)
    )
}
