package com.openminis.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Auris brand palette (design_handoff_auris_rebrand/README.md).
//
//   Ink   #3C3744  text on light; base for dark surfaces
//   Deep  #090C9B  brand, primary actions (light)
//   Royal #3D52D5  accent/links (light); primary (dark)
//   Mist  #B4C5E4  chips, selection; secondary text + accent (dark)
//   Cream #FBFFF1  light background; text on dark and on Deep
//
// Mapped onto the M3 scheme per the handoff: primary / onPrimary,
// primaryContainer = chip, onPrimaryContainer = chipText, background = bg,
// surfaceContainer = elevated, onSurface = text, onSurfaceVariant = text2,
// outline = inputBorder. Dynamic color stays off so these always apply.
//
// Names keep the `Teal` prefix only to avoid churning 90+ call sites; the
// value is the contract, not the name.
private val TealPrimary = Color(0xFF090C9B)
private val TealOnPrimary = Color(0xFFFBFFF1)
private val TealPrimaryContainer = Color(0xFFE1E8F3)
private val TealOnPrimaryContainer = Color(0xFF090C9B)
private val TealSecondary = Color(0xFF665F70)
private val TealOnSecondary = Color(0xFFFBFFF1)
private val TealSecondaryContainer = Color(0xFFEEF0E8)
private val TealOnSecondaryContainer = Color(0xFF3C3744)
private val TealTertiary = Color(0xFF3D52D5)
private val TealOnTertiary = Color(0xFFFFFFFF)
private val TealTertiaryContainer = Color(0xFFE1E8F3)
private val TealOnTertiaryContainer = Color(0xFF090C9B)
private val TealBackground = Color(0xFFFBFFF1)
private val TealOnBackground = Color(0xFF3C3744)
private val TealSurface = Color(0xFFFFFFFF)
private val TealOnSurface = Color(0xFF3C3744)
private val TealSurfaceVariant = Color(0xFFFFFFFF)
private val TealOnSurfaceVariant = Color(0xFF665F70)
private val TealOutline = Color(0xFFDAD8DC)

private val TealDarkPrimary = Color(0xFF3D52D5)
private val TealDarkOnPrimary = Color(0xFFFFFFFF)
private val TealDarkPrimaryContainer = Color(0xFF252A52)
private val TealDarkOnPrimaryContainer = Color(0xFFD5DFF1)
private val TealDarkSecondary = Color(0xFFB4C5E4)
private val TealDarkOnSecondary = Color(0xFF141219)
private val TealDarkSecondaryContainer = Color(0xFF2A2630)
private val TealDarkOnSecondaryContainer = Color(0xFFFBFFF1)
private val TealDarkBackground = Color(0xFF141219)
private val TealDarkOnBackground = Color(0xFFFBFFF1)
private val TealDarkSurface = Color(0xFF1F1C24)
private val TealDarkOnSurface = Color(0xFFFBFFF1)
private val TealDarkSurfaceVariant = Color(0xFF1F1C24)
private val TealDarkOnSurfaceVariant = Color(0xFFB4C5E4)
private val TealDarkOutline = Color(0xFF332F38)

// Grouped-card surfaces (iOS-style system-grouped background), in the Auris
// semantic tokens. Override Material3's tonal `surfaceContainer*` so cards
// don't pick up a primary tint.
// Light: page = grouped #F1F3EA, card = surface #FFFFFF, elevated = #EEF0E8
// Dark:  page = grouped #0E0D11, card = surface #1F1C24, elevated = #2A2630
private val NeutralGroupedBg = Color(0xFFF1F3EA)
private val NeutralGroupedCard = Color(0xFFFFFFFF)
private val NeutralGroupedCardElevated = Color(0xFFEEF0E8)
private val NeutralOutline = Color(0xFFDAD8DC)

private val NeutralDarkGroupedBg = Color(0xFF0E0D11)
private val NeutralDarkGroupedCard = Color(0xFF1F1C24)
private val NeutralDarkGroupedCardElevated = Color(0xFF2A2630)
private val NeutralDarkOutline = Color(0xFF332F38)

private val LightColorScheme = lightColorScheme(
    primary = TealPrimary,
    onPrimary = TealOnPrimary,
    primaryContainer = TealPrimaryContainer,
    onPrimaryContainer = TealOnPrimaryContainer,
    secondary = TealSecondary,
    onSecondary = TealOnSecondary,
    secondaryContainer = TealSecondaryContainer,
    onSecondaryContainer = TealOnSecondaryContainer,
    tertiary = TealTertiary,
    onTertiary = TealOnTertiary,
    tertiaryContainer = TealTertiaryContainer,
    onTertiaryContainer = TealOnTertiaryContainer,
    background = NeutralGroupedBg,
    onBackground = TealOnBackground,
    surface = NeutralGroupedBg,
    onSurface = TealOnSurface,
    surfaceVariant = NeutralGroupedCard,
    onSurfaceVariant = TealOnSurfaceVariant,
    surfaceContainerLowest = NeutralGroupedBg,
    surfaceContainerLow = NeutralGroupedCard,
    surfaceContainer = NeutralGroupedCard,
    surfaceContainerHigh = NeutralGroupedCardElevated,
    surfaceContainerHighest = NeutralGroupedCardElevated,
    outline = NeutralOutline,
    outlineVariant = NeutralOutline,
)

private val DarkColorScheme = darkColorScheme(
    primary = TealDarkPrimary,
    onPrimary = TealDarkOnPrimary,
    primaryContainer = TealDarkPrimaryContainer,
    onPrimaryContainer = TealDarkOnPrimaryContainer,
    secondary = TealDarkSecondary,
    onSecondary = TealDarkOnSecondary,
    secondaryContainer = TealDarkSecondaryContainer,
    onSecondaryContainer = TealDarkOnSecondaryContainer,
    background = NeutralDarkGroupedBg,
    onBackground = TealDarkOnBackground,
    surface = NeutralDarkGroupedBg,
    onSurface = TealDarkOnSurface,
    surfaceVariant = NeutralDarkGroupedCard,
    onSurfaceVariant = TealDarkOnSurfaceVariant,
    surfaceContainerLowest = NeutralDarkGroupedBg,
    surfaceContainerLow = NeutralDarkGroupedCard,
    surfaceContainer = NeutralDarkGroupedCard,
    surfaceContainerHigh = NeutralDarkGroupedCardElevated,
    surfaceContainerHighest = NeutralDarkGroupedCardElevated,
    outline = NeutralDarkOutline,
    outlineVariant = NeutralDarkOutline,
)

// App-wide FAB accent color (Auris brand primary, matching iOS New Chat button).
// Reads from ChatPalette so it follows the in-app theme override (theme_mode pref),
// not android.isSystemInDarkTheme(), which only tracks the system setting.
@Composable
fun minisFabColor(): Color = LocalChatPalette.current.fabAccent

// App-wide shape system — larger corners for a modern, friendly feel
// DropdownMenu uses extraSmall, Dialog uses extraLarge, BottomSheet uses extraLarge
private val MinisShapes = Shapes(
    extraSmall = RoundedCornerShape(12.dp),   // DropdownMenu, Tooltip, OutlinedTextField default
    small = RoundedCornerShape(12.dp),        // Chip, TextField
    medium = RoundedCornerShape(20.dp),       // Card, Snackbar
    large = RoundedCornerShape(24.dp),        // NavigationDrawer
    extraLarge = RoundedCornerShape(28.dp),   // Dialog, BottomSheet
)

@Composable
fun MinisTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    fontScale: Float = 1f,
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val typography = scaledTypography(fontScale)
    val chatPalette = if (darkTheme) DarkChatPalette else LightChatPalette

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = MinisShapes,
        typography = typography,
    ) {
        CompositionLocalProvider(LocalChatPalette provides chatPalette, content = content)
    }
}

private fun TextStyle.scale(factor: Float): TextStyle =
    if (factor == 1f) this else copy(fontSize = fontSize * factor)

private fun scaledTypography(factor: Float): Typography {
    val base = Typography()
    return Typography(
        displayLarge = base.displayLarge.scale(factor),
        displayMedium = base.displayMedium.scale(factor),
        displaySmall = base.displaySmall.scale(factor),
        headlineLarge = base.headlineLarge.scale(factor),
        headlineMedium = base.headlineMedium.scale(factor),
        headlineSmall = base.headlineSmall.scale(factor),
        titleLarge = base.titleLarge.scale(factor),
        titleMedium = base.titleMedium.scale(factor),
        titleSmall = base.titleSmall.scale(factor),
        bodyLarge = base.bodyLarge.scale(factor),
        bodyMedium = base.bodyMedium.scale(factor),
        bodySmall = base.bodySmall.scale(factor),
        labelLarge = base.labelLarge.scale(factor),
        labelMedium = base.labelMedium.scale(factor),
        labelSmall = base.labelSmall.scale(factor),
    )
}
