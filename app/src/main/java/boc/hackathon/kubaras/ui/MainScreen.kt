@file:OptIn(ExperimentalMaterial3Api::class)

package boc.hackathon.kubaras.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import boc.hackathon.kubaras.R
import boc.hackathon.kubaras.ui.theme.AppTheme
import boc.hackathon.kubaras.ui.theme.Typography


@Composable
internal fun MainScreen(
    onBannerClick: () -> Unit,
) {
    Scaffold(
        modifier = Modifier.background(Color(0xFFF0F0F0)),
        topBar = {
            Box(
                modifier = Modifier
                    .padding(top = 25.dp, start = 24.dp, end = 24.dp)
                    .fillMaxWidth()
            ) {
                Row {
                    Image(
                        modifier = Modifier.size(42.dp),
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds
                    )
                    Column(
                        modifier = Modifier.padding(start = 12.dp)
                    ) {
                        Text(
                            text = "Good Morning",
                            style = Typography.labelSmall
                        )
                        Text(
                            text = "Slava Kagramanov ",
                            style = Typography.titleLarge,
                        )
                    }
                    Spacer(Modifier.weight(1f))
                    Image(
                        painterResource(R.drawable.notification),
                        contentDescription = "notification",
                    )
                }
            }

        },
    ) { innerPaddings ->

        Column(
            Modifier
                .padding(innerPaddings)
                .padding(24.dp)
                .verticalScroll(rememberScrollState())
        ) {
            PromoRow()
            AccountAmmount()
            Cards()
            QuickActions()
            MonitoringCards()
            Banner(onBannerClick)
        }
    }
}

@Composable
private fun Banner(
    onBannerClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp),
        onClick = onBannerClick
    ) {
        Box(
            Modifier.fillMaxSize()
                .paint(
                    painterResource(R.drawable.banner_gradient),
                    contentScale = ContentScale.FillBounds
                )
        ) {
            Row(modifier = Modifier.padding(16.dp)) {
                Column(
                    modifier = Modifier
                        .weight(2f)
                        .align(Alignment.CenterVertically)
                ) {
                    Text(
                        text = "Open smart saving account",
                        style = Typography.displayMedium,
                        color = Color.White
                    )
                    Text(
                        text = "Save money by rounding up expenses",
                        style = Typography.bodyLarge,
                        color = Color.White
                    )
                }
                Image(
                    modifier = Modifier
                        .weight(1f)
                        .size(100.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(R.drawable.pig),
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
private fun MonitoringCards() {
    Row(modifier = Modifier.padding(top = 24.dp).fillMaxWidth().height(intrinsicSize = IntrinsicSize.Max)) {
        MonitoringCard(
            modifier = Modifier.weight(1f),
            amount = "€ 1 503,87",
            label = "Spent in September",
            title = "Account operations"
        )
        Spacer(Modifier.size(25.dp))
        MonitoringCard(
            modifier = Modifier.weight(1f),
            amount = "€ 2,03",
            label = "203 points",
            title = "My Antamivi Points"
        )
    }
}

@Composable
private fun MonitoringCard(
    modifier: Modifier = Modifier,
    amount: String,
    label: String,
    title: String
) {
    Card(modifier) {
        Column(Modifier.padding(16.dp)) {
            Text(
                text = amount,
                style = Typography.displayMedium
            )
            Text(
                text = label,
                style = Typography.bodyLarge,
                color = Color(0xA0262626)
            )
            Spacer(Modifier.weight(1f))
            Text(
                modifier = Modifier.padding(top = 32.dp),
                text = title,
                style = Typography.labelMedium
            )
        }
        Spacer(Modifier.weight(1f))
    }
}

@Composable
private fun QuickActions() {
    Card(
        Modifier.padding(top = 24.dp).fillMaxWidth()
    ) {
        Row {
            Column(
                Modifier.weight(1f).padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.transfer),
                    contentDescription = "Transfer"
                )
                Text(
                    text = "Transfer",
                    color = Color(0xFF036D86),
                    style = Typography.labelSmall
                )
            }
            Column(
                Modifier.weight(1f).padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.arrow),
                    contentDescription = "QuickPay"
                )
                Text(
                    text = "QuickPay",
                    color = Color(0xFF036D86),
                    style = Typography.labelSmall
                )
            }
        }
    }
}

@Composable
private fun Cards() {
    Row(modifier = Modifier.padding(top = 24.dp)) {
        Image(
            modifier = Modifier.size(width = 64.dp, height = 40.dp),
            painter = painterResource(R.drawable.card),
            contentDescription = "card",
        )
        Image(
            modifier = Modifier.size(width = 64.dp, height = 40.dp).padding(start = 8.dp),
            painter = painterResource(R.drawable.add_card),
            contentDescription = "add card",
        )
    }
}

@Composable
private fun AccountAmmount() {
    Column(Modifier.padding(top = 32.dp)) {
        Text("Available", style = Typography.bodySmall)
        Text("€ 37 867,23", style = Typography.labelLarge)
    }
}

@Composable
private fun PromoRow() {
    Row(modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)) {
        PromoCard(
            modifier = Modifier.weight(1f),
            icon = painterResource(R.drawable.car_insurance),
            text = "Buy car insurance"
        )
        PromoCard(
            modifier = Modifier.weight(1f).padding(start = 9.dp),
            icon = painterResource(R.drawable.home_insurance),
            text = "Home insurance"
        )
        PromoCard(
            modifier = Modifier.weight(1f).padding(start = 9.dp),
            icon = painterResource(R.drawable.quick_loans),
            text = "Personal needs loans"
        )
    }
}

@Composable
private fun PromoCard(
    modifier: Modifier = Modifier,
    icon: Painter,
    text: String,
) {
    Card(modifier = modifier) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.Start,
        ) {
            Image(painter = icon, contentDescription = text)
            Spacer(Modifier.weight(1f))
            Text(text = text, style = Typography.bodyLarge)
        }
        Spacer(Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        MainScreen({})
    }
}