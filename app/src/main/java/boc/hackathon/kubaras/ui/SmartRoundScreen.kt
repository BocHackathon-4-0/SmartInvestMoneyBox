@file:OptIn(ExperimentalMaterial3Api::class)

package boc.hackathon.kubaras.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import boc.hackathon.kubaras.R
import boc.hackathon.kubaras.ui.theme.Typography
import boc.hackathon.kubaras.ui.theme.nuintioFamily

@Composable
fun SmartRoundScreen(
    onClick: () -> Unit
) {
    Scaffold(
        modifier = Modifier.background(Color(0xFFF0F0F0)),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "",
                        textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {
                    Image(
                        modifier = Modifier.padding(start = 8.dp),
                        painter = painterResource(R.drawable.back_arrow),
                        contentDescription = null
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFF0F0F0))
            )
        },
    ) { innerPaddings ->
        Column(
            Modifier
                .padding(innerPaddings)
                .padding(horizontal = 24.dp)
        ) {
            Text(
                text = "How the SmartInvest Money Box works",
                style = TextStyle(
                    fontFamily = nuintioFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    lineHeight = 32.sp,
                ),
            )
            Text(
                text = "There is smart rounding of transactions in the SmartInvest Money Box, the rounding step will be determined automatically depending on the purchase amount. You can also deposit manually",
                style = TextStyle(
                    fontFamily = nuintioFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                ),
            )
            Spacer(Modifier.size(32.dp))
            RoundCard(
                image = painterResource(R.drawable.round_5),
                title = "0 to €100",
                caption = "rounded in increments of €5",
            )
            Spacer(Modifier.size(32.dp))
            RoundCard(
                image = painterResource(R.drawable.round_10),
                title = "100 to €500",
                caption = "rounded in increments of €10",
            )
            Spacer(Modifier.size(32.dp))
            RoundCard(
                image = painterResource(R.drawable.round_25),
                title = "500 to €1000",
                caption = "rounded in increments of €25",
            )
            Spacer(Modifier.size(32.dp))
            RoundCard(
                image = painterResource(R.drawable.round_50),
                title = "1000 to €5000",
                caption = "rounded in increments of €50",
            )
            Spacer(Modifier.size(32.dp))
            RoundCard(
                image = painterResource(R.drawable.round_100),
                title = "From €5000",
                caption = "rounded in increments of €100",
            )
            Spacer(Modifier.weight(1f))
            Button(
                modifier = Modifier.fillMaxWidth().padding(vertical = 32.dp),
                onClick = onClick,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFDB827))
            ) {
                Text(
                    modifier = Modifier.padding(vertical = 8.dp),
                    text = "Next",
                    style = Typography.displayMedium,
                    color = Color.Black
                )
            }
        }
    }
}

@Composable
fun RoundCard(
    image: Painter,
    title: String,
    caption: String,
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = image,
            contentDescription = null
        )
        Column(Modifier.padding(start = 8.dp)) {
            Text(
                text = title,
                style = Typography.displayMedium
            )
            Text(
                text = caption,
                style = Typography.labelMedium,
                color = Color(0xFF262626)
            )
        }
    }
}