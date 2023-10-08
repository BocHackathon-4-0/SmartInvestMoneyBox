package boc.hackathon.kubaras.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import boc.hackathon.kubaras.R


val nuintioFamily = FontFamily(
    Font(R.font.nuinto_extralight, FontWeight.ExtraLight),
    Font(R.font.nuinto_extralight_italic, FontWeight.ExtraLight, FontStyle.Italic),
    Font(R.font.nuinto_light, FontWeight.Light),
    Font(R.font.nuinto_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.nuinto_medium, FontWeight.Medium),
    Font(R.font.nuinto_light_italic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.nuinto_black, FontWeight.Black),
    Font(R.font.nuinto_black_italic, FontWeight.Black, FontStyle.Italic),
    Font(R.font.nuinto_semibold, FontWeight.SemiBold),
    Font(R.font.nuinto_semibold_italic, FontWeight.SemiBold, FontStyle.Italic),
    Font(R.font.nuinto_regular, FontWeight.Normal),
    Font(R.font.niunto_bold, FontWeight.Bold),
    Font(R.font.nuinto_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.nuinto_extrabold, FontWeight.ExtraBold),
    Font(R.font.nuinto_extrabold_italic, FontWeight.ExtraBold, FontStyle.Italic),
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = nuintioFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = nuintioFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = nuintioFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.5.sp
    ),
    labelLarge = TextStyle(
        fontFamily = nuintioFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 40.sp,
        lineHeight = 56.sp,
        letterSpacing = 0.5.sp
    ),
    labelMedium = TextStyle(
        fontFamily = nuintioFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 20.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = nuintioFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayMedium = TextStyle(
        fontFamily = nuintioFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

