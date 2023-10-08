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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import boc.hackathon.kubaras.ui.theme.Typography
import boc.hackathon.kubaras.ui.theme.nuintioFamily
import com.patrykandpatrick.vico.compose.axis.vertical.rememberStartAxis
import com.patrykandpatrick.vico.compose.chart.Chart
import com.patrykandpatrick.vico.compose.chart.line.lineChart
import com.patrykandpatrick.vico.core.entry.entryModelOf
import boc.hackathon.kubaras.R

@Composable
fun RiskDetailsScreen(
    onClick: () -> Unit
) {

    Scaffold(
        modifier = Modifier.background(Color(0xFFF0F0F0)),
        topBar = {
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .padding(top = 25.dp, start = 24.dp, end = 24.dp)
                    .fillMaxWidth()
            ) {
                Row {
                    Image(
                        modifier = Modifier.size(42.dp),
                        painter = painterResource(id = R.drawable.boc),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds
                    )
                    Column(
                        modifier = Modifier.padding(start = 12.dp)
                    ) {
                        Text(
                            text = "Bank of Cyprus Foundation",
                            style = Typography.labelSmall
                        )
                        Text(
                            text = "Bank of Cyprus",
                            style = Typography.titleLarge,
                        )
                    }
                    Spacer(Modifier.weight(1f))
                    Image(
                        painterResource(R.drawable.close),
                        contentDescription = "closw",
                    )
                }
            }

        },
    ) { innerPaddings ->

        Column(
            Modifier
                .padding(innerPaddings)
                .verticalScroll(rememberScrollState())
        ) {
            Card {
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp, start = 24.dp, end=24.dp),
                    text = "Historical 20-year yields",
                    style = TextStyle(
                        fontFamily = nuintioFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 28.sp,
                    ),
                )

                val chartEntryModel = entryModelOf(170f, 150f, 160f, 180f, 190f, 210f, 250f, 240f, 300f)

                Chart(
                    modifier = Modifier.padding(top = 16.dp),
                    chart = lineChart(),
                    model = chartEntryModel,
                    startAxis = rememberStartAxis(),
                )
                Spacer(Modifier.size(16.dp))
            }

            Text(
                modifier = Modifier.padding(top = 16.dp, start = 24.dp, end = 24.dp),
                text = "The fund's balanced portfolio consists of stocks, long-term and short-term bonds, and gold.",
                style = TextStyle(
                    fontFamily = nuintioFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                )
            )

            Bullet(
                image = painterResource(R.drawable.low_risk),
                title = "Low risk",
                caption = "compared to buying individual shares"
            )
            Spacer(Modifier.size(4.dp))

            Bullet(
                image = painterResource(R.drawable.arrow_increase),
                title = "13% in euros",
                caption = "Average annual yield"
            )
            Spacer(Modifier.size(4.dp))

            Bullet(
                image = painterResource(R.drawable.chart_increase),
                title = "€ 7.2 billion",
                caption = "Net asset value"
            )
            Spacer(Modifier.size(4.dp))

            Image(
                painterResource(R.drawable.circle_chart),
                contentDescription = null
            )

            Text(
                modifier = Modifier.padding(top = 16.dp, start = 24.dp, end = 24.dp),
                text = "The portfolio combines the potential of the stock market with the low volatility of bonds.",
                style = TextStyle(
                    fontFamily = nuintioFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                )
            )

            Button(
                modifier = Modifier.fillMaxWidth().padding(top = 40.dp, bottom = 32.dp, start = 24.dp, end = 24.dp),
                onClick = onClick,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFDB827))
            ) {
                Text(
                    modifier = Modifier.padding(vertical = 8.dp),
                    text = "Open",
                    style = Typography.displayMedium,
                    color = Color.Black
                )
            }
        }
    }


}

@Composable
fun Bullet(
    image: Painter,
    title: String,
    caption: String,
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