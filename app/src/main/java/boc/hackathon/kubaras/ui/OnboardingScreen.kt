@file:OptIn(ExperimentalMaterial3Api::class)

package boc.hackathon.kubaras.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import boc.hackathon.kubaras.ui.theme.Typography
import boc.hackathon.kubaras.R

@Composable
fun OnboardingScreen(
    onClick: () -> Unit
) {
    Column {
        val painter = painterResource(R.drawable.onboarding_top)
        Image(
            modifier = Modifier
                .aspectRatio(painter.intrinsicSize.width / painter.intrinsicSize.height)
                .fillMaxWidth(),
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Fit

        )
        Column(Modifier
            .padding(top = 24.dp, start = 24.dp, end = 32.dp)
        ) {
            OnboardingTip(
                image = painterResource(R.drawable.piggy),
                text = "We round up your expenses to an integer and put the rest in the SmartInvest Money Box."
            )
            Spacer(Modifier.size(32.dp))
            OnboardingTip(
                image = painterResource(R.drawable.arrow_increase),
                text = "While your money is in the SmartInvest Money Box, it is invested with an income of up to 12%"
            )
            Spacer(Modifier.size(32.dp))
            OnboardingTip(
                image = painterResource(R.drawable.cash_briefcase),
                text = "A good way to generate passive income"
            )
            Spacer(Modifier.weight(1f))
            Button(
                modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp),
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
private fun OnboardingTip(
    image: Painter,
    text: String
) {
    Row {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = text,
            style = Typography.bodySmall
        )
    }
}
