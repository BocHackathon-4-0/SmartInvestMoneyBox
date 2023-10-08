package boc.hackathon.kubaras.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val md_theme_light_primary = Color(0xFF036D86)
val md_theme_light_onPrimary = Color(0xFFFFFFFF)
val md_theme_light_primaryContainer = Color(0xFFEADDFF)
val md_theme_light_onPrimaryContainer = Color(0xFF21005D)
val md_theme_light_secondary = Color(0xFF625B71)
val md_theme_light_onSecondary = Color(0xFFFFFFFF)
val md_theme_light_secondaryContainer = Color(0xFFE8DEF8)
val md_theme_light_onSecondaryContainer = Color(0xFF1D192B)
val md_theme_light_tertiary = Color(0xFF7D5260)
val md_theme_light_onTertiary = Color(0xFFFFFFFF)
val md_theme_light_tertiaryContainer = Color(0xFFFFD8E4)
val md_theme_light_onTertiaryContainer = Color(0xFF31111D)
val md_theme_light_error = Color(0xFFB3261E)
val md_theme_light_onError = Color(0xFFFFFFFF)
val md_theme_light_errorContainer = Color(0xFFF9DEDC)
val md_theme_light_onErrorContainer = Color(0xFF410E0B)
val md_theme_light_outline = Color(0xFF79747E)
val md_theme_light_background = Color(0xFFF0F0F0)
val md_theme_light_onBackground = Color(0xFF1D1B20)
val md_theme_light_surface = Color(0xFFFEF7FF)
val md_theme_light_onSurface = Color(0xFF1D1B20)
val md_theme_light_surfaceVariant = Color(0xFFFFFFFF)
val md_theme_light_onSurfaceVariant = Color(0xFF49454F)
val md_theme_light_inverseSurface = Color(0xFF322F35)
val md_theme_light_inverseOnSurface = Color(0xFFF5EFF7)
val md_theme_light_inversePrimary = Color(0xFFD0BCFF)
val md_theme_light_surfaceTint = Color(0xFF6750A4)
val md_theme_light_outlineVariant = Color(0xFFCAC4D0)
val md_theme_light_scrim = Color(0xFF000000)

val md_theme_dark_primary = Color(0xFF036D86)
val md_theme_dark_onPrimary = Color(0xFF381E72)
val md_theme_dark_primaryContainer = Color(0xFF4F378B)
val md_theme_dark_onPrimaryContainer = Color(0xFFEADDFF)
val md_theme_dark_secondary = Color(0xFFCCC2DC)
val md_theme_dark_onSecondary = Color(0xFF332D41)
val md_theme_dark_secondaryContainer = Color(0xFF4A4458)
val md_theme_dark_onSecondaryContainer = Color(0xFFE8DEF8)
val md_theme_dark_tertiary = Color(0xFFEFB8C8)
val md_theme_dark_onTertiary = Color(0xFF492532)
val md_theme_dark_tertiaryContainer = Color(0xFF633B48)
val md_theme_dark_onTertiaryContainer = Color(0xFFFFD8E4)
val md_theme_dark_error = Color(0xFFF2B8B5)
val md_theme_dark_onError = Color(0xFF601410)
val md_theme_dark_errorContainer = Color(0xFF8C1D18)
val md_theme_dark_onErrorContainer = Color(0xFFF9DEDC)
val md_theme_dark_outline = Color(0xFF938F99)
val md_theme_dark_background = Color(0xFF141218)
val md_theme_dark_onBackground = Color(0xFFE6E0E9)
val md_theme_dark_surface = Color(0xFF141218)
val md_theme_dark_onSurface = Color(0xFFE6E0E9)
val md_theme_dark_surfaceVariant = Color(0xFF49454F)
val md_theme_dark_onSurfaceVariant = Color(0xFFCAC4D0)
val md_theme_dark_inverseSurface = Color(0xFFE6E0E9)
val md_theme_dark_inverseOnSurface = Color(0xFF322F35)
val md_theme_dark_inversePrimary = Color(0xFF6750A4)
val md_theme_dark_surfaceTint = Color(0xFFD0BCFF)
val md_theme_dark_outlineVariant = Color(0xFF49454F)
val md_theme_dark_scrim = Color(0xFF000000)


val seed = Color(0xFF6750A4)

@Preview(device = "spec:width=2000px,height=10000px,dpi=440")
@Composable
fun Preview() {
    val lights = mapOf(
        "md_theme_light_primary" to md_theme_light_primary,
        "md_theme_light_onPrimary" to md_theme_light_onPrimary,
        "md_theme_light_primaryContainer" to md_theme_light_primaryContainer,
        "md_theme_light_onPrimaryContainer" to md_theme_light_onPrimaryContainer,
        "md_theme_light_secondary" to md_theme_light_secondary,
        "md_theme_light_onSecondary" to md_theme_light_onSecondary,
        "md_theme_light_secondaryContainer" to md_theme_light_secondaryContainer,
        "md_theme_light_onSecondaryContainer" to md_theme_light_onSecondaryContainer,
        "md_theme_light_tertiary" to md_theme_light_tertiary,
        "md_theme_light_onTertiary" to md_theme_light_onTertiary,
        "md_theme_light_tertiaryContainer" to md_theme_light_tertiaryContainer,
        "md_theme_light_onTertiaryContainer" to md_theme_light_onTertiaryContainer,
        "md_theme_light_error" to md_theme_light_error,
        "md_theme_light_onError" to md_theme_light_onError,
        "md_theme_light_errorContainer" to md_theme_light_errorContainer,
        "md_theme_light_onErrorContainer" to md_theme_light_onErrorContainer,
        "md_theme_light_outline" to md_theme_light_outline,
        "md_theme_light_background" to md_theme_light_background,
        "md_theme_light_onBackground" to md_theme_light_onBackground,
        "md_theme_light_surface" to md_theme_light_surface,
        "md_theme_light_onSurface" to md_theme_light_onSurface,
        "md_theme_light_surfaceVariant" to md_theme_light_surfaceVariant,
        "md_theme_light_onSurfaceVariant" to md_theme_light_onSurfaceVariant,
        "md_theme_light_inverseSurface" to md_theme_light_inverseSurface,
        "md_theme_light_inverseOnSurface" to md_theme_light_inverseOnSurface,
        "md_theme_light_inversePrimary" to md_theme_light_inversePrimary,
        "md_theme_light_surfaceTint" to md_theme_light_surfaceTint,
        "md_theme_light_outlineVariant" to md_theme_light_outlineVariant,
        "md_theme_light_scrim" to md_theme_light_scrim
    )

    val dark = mapOf(
        "md_theme_dark_primary" to md_theme_dark_primary,
        "md_theme_dark_onPrimary" to md_theme_dark_onPrimary,
        "md_theme_dark_primaryContainer" to md_theme_dark_primaryContainer,
        "md_theme_dark_onPrimaryContainer" to md_theme_dark_onPrimaryContainer,
        "md_theme_dark_secondary" to md_theme_dark_secondary,
        "md_theme_dark_onSecondary" to md_theme_dark_onSecondary,
        "md_theme_dark_secondaryContainer" to md_theme_dark_secondaryContainer,
        "md_theme_dark_onSecondaryContainer" to md_theme_dark_onSecondaryContainer,
        "md_theme_dark_tertiary" to md_theme_dark_tertiary,
        "md_theme_dark_onTertiary" to md_theme_dark_onTertiary,
        "md_theme_dark_tertiaryContainer" to md_theme_dark_tertiaryContainer,
        "md_theme_dark_onTertiaryContainer" to md_theme_dark_onTertiaryContainer,
        "md_theme_dark_error" to md_theme_dark_error,
        "md_theme_dark_onError" to md_theme_dark_onError,
        "md_theme_dark_errorContainer" to md_theme_dark_errorContainer,
        "md_theme_dark_onErrorContainer" to md_theme_dark_onErrorContainer,
        "md_theme_dark_outline" to md_theme_dark_outline,
        "md_theme_dark_background" to md_theme_dark_background,
        "md_theme_dark_onBackground" to md_theme_dark_onBackground,
        "md_theme_dark_surface" to md_theme_dark_surface,
        "md_theme_dark_onSurface" to md_theme_dark_onSurface,
        "md_theme_dark_surfaceVariant" to md_theme_dark_surfaceVariant,
        "md_theme_dark_onSurfaceVariant" to md_theme_dark_onSurfaceVariant,
        "md_theme_dark_inverseSurface" to md_theme_dark_inverseSurface,
        "md_theme_dark_inverseOnSurface" to md_theme_dark_inverseOnSurface,
        "md_theme_dark_inversePrimary" to md_theme_dark_inversePrimary,
        "md_theme_dark_surfaceTint" to md_theme_dark_surfaceTint,
        "md_theme_dark_outlineVariant" to md_theme_dark_outlineVariant,
        "md_theme_dark_scrim" to md_theme_dark_scrim,
    )
    Row {
        Column {
            lights.forEach { (name, color) ->
                Box(Modifier.background(color).padding(8.dp)) {
                    Text(name)
                }
            }
        }
        Column {
            dark.forEach { (name, color) ->
                Box(Modifier.background(color).padding(8.dp)) {
                    Text(name)
                }
            }
        }
    }

}