@file:OptIn(ExperimentalMaterial3Api::class)

package boc.hackathon.kubaras.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun RiskScreen(
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
                .verticalScroll(rememberScrollState())
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
            RiskCard(
                image = painterResource(R.drawable.low_risk),
                title = "Low risk",
                caption = "Average annual yield 12%",
                onClick = onClick,
            )
            Spacer(Modifier.size(16.dp))
            RiskCard(
                image = painterResource(R.drawable.medium_risk),
                title = "Medium risk",
                caption = "Average annual yield 24%",
                onClick = onClick,
            )
            Spacer(Modifier.size(16.dp))
            RiskCard(
                image = painterResource(R.drawable.high_risk),
                title = "High risk",
                caption = "Average annual yield 35%",
                onClick = onClick,
            )
            Spacer(Modifier.size(16.dp))
        }
    }
}

@Composable
fun RiskCard(
    image: Painter,
    title: String,
    caption: String,
    onClick: () -> Unit,
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = onClick,
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
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
}