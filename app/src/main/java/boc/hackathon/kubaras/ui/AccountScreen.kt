@file:OptIn(ExperimentalMaterial3Api::class)

package boc.hackathon.kubaras.ui

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import boc.hackathon.kubaras.R
import boc.hackathon.kubaras.data.TransactionData
import boc.hackathon.kubaras.ui.theme.Typography
import boc.hackathon.kubaras.ui.theme.nuintioFamily
import com.patrykandpatrick.vico.compose.axis.vertical.rememberStartAxis
import com.patrykandpatrick.vico.compose.chart.Chart
import com.patrykandpatrick.vico.compose.chart.line.lineChart
import com.patrykandpatrick.vico.core.entry.entryModelOf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import java.math.RoundingMode
import java.text.DecimalFormat

@Composable
fun AccountScreen() {

    val state = remember { mutableStateOf(TransactionData()) }

    val activity = (LocalContext.current as Activity)
    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            val jsonString = activity.assets.open("answer.json").bufferedReader().use { it.readText() }

            state.value = Json.decodeFromString<TransactionData>(jsonString)
        }
    }
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
                text = "SmartInvest money box",
                style = TextStyle(
                    fontFamily = nuintioFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    lineHeight = 25.sp
                ),
                color = Color(0xFF262626)
            )
            val df = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.DOWN
            val amount = df.format(state.value.amount).toString()
            Text(
                text = amount,
                style = TextStyle(
                    fontFamily = nuintioFamily,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 40.sp,
                )
            )
            Spacer(Modifier.size(24.dp))
            QuickActions({})
            Card(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row {
                        Text(
                            text = "SmartInvest income ",
                            style = TextStyle(
                                fontFamily = nuintioFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 18.sp,
                                lineHeight = 24.sp,
                            ),
                            color = Color(0xFF262626)
                        )
                        Text(
                            text = df.format(state.value.earned),
                            style = TextStyle(
                                fontFamily = nuintioFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 18.sp,
                                lineHeight = 24.sp,
                            ),
                            color = Color(0xFF009E10)
                        )
                    }
                    Text(
                        text = "Overall you have accumulated €884,03",
                        style = Typography.labelSmall
                    )
                    val chartEntryModel =
                        entryModelOf(900f, 850f, 1100f, 1000f, 1200f, 1300f, 1400f, 1300f, 1400f, 1500f, 1600f, 1600f)

                    Chart(
                        chart = lineChart(),
                        model = chartEntryModel,
                        startAxis = rememberStartAxis(),
                    )
                }
            }

            Text(
                modifier = Modifier.padding(top = 24.dp, bottom = 16.dp),
                text = "Transactions",
                style = TextStyle(
                    fontFamily = nuintioFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    lineHeight = 28.sp,
                )
            )

            state.value.transactionsFromSaveAccount.takeLast(20).map {
                TransactionCard(
                    title = "+ € ${df.format(it.amount)}",
                    caption = it.description
                )
                Spacer(Modifier.size(16.dp))
            }

        }
    }
}

@Composable
private fun QuickActions(
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier.padding(top = 8.dp).fillMaxWidth(),
        onClick = onClick
    ) {
        Row {
            Column(
                Modifier.weight(1f).padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.settings),
                    contentDescription = "Settings"
                )
                Text(
                    text = "Settings",
                    color = Color(0xFF036D86),
                    style = Typography.labelSmall
                )
            }
            Column(
                Modifier.weight(1f).padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.down_arrow),
                    contentDescription = "Deposit"
                )
                Text(
                    text = "Deposit",
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
                    contentDescription = "Withdrawal"
                )
                Text(
                    text = "Withdrawal",
                    color = Color(0xFF036D86),
                    style = Typography.labelSmall
                )
            }
        }
    }
}


@Composable
fun TransactionCard(
    title: String,
    caption: String,
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.trans_icon),
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