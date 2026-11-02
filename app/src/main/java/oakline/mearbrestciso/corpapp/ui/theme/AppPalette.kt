package oakline.mearbrestciso.corpapp.ui.theme

import androidx.compose.ui.graphics.Color
import oakline.mearbrestciso.corpapp.ui.theme.Palette

// Based on the colors: #9FD0D6, #ECD577, #F2A176, #985D73, #251F25
// Background is the given light teal itself (#9FD0D6), as requested. Cards/panels
// (surfaceContainer*) ramp toward near-white so they stay clearly distinct from the
// background instead of risking another, too-similar shade of teal. The warm trio
// (yellow/orange/plum) carries the three accent roles, and the given near-black
// (#251F25) is the text/outline color — already dark enough, nothing to invent there.
val AppPalette = Palette(
    primary = Color(0xFFF2A176),
    onPrimary = Color(0xFF251F25),
    primaryContainer = Color(0xFFFFE0CC),
    onPrimaryContainer = Color(0xFF251F25),

    secondary = Color(0xFF985D73),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFF0DCE2),
    onSecondaryContainer = Color(0xFF251F25),

    tertiary = Color(0xFFECD577),
    onTertiary = Color(0xFF251F25),
    tertiaryContainer = Color(0xFFFBF2D4),
    onTertiaryContainer = Color(0xFF251F25),

    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),

    background = Color(0xFF9FD0D6),
    onBackground = Color(0xFF251F25),

    surface = Color(0xFF9FD0D6),
    onSurface = Color(0xFF251F25),

    surfaceVariant = Color(0xFFE3F1F3),
    onSurfaceVariant = Color(0xFF3A4A4D),

    surfaceTint = Color(0xFFF2A176),
    surfaceDim = Color(0xFF9FD0D6),
    surfaceBright = Color(0xFFFFFFFF),

    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainerLow = Color(0xFFF3FAFB),
    surfaceContainer = Color(0xFFE3F1F3),
    surfaceContainerHigh = Color(0xFFC7E4E8),
    surfaceContainerHighest = Color(0xFFAEDAE0),

    outline = Color(0xFF251F25),
    outlineVariant = Color(0xFFE3F1F3),

    inverseSurface = Color(0xFF251F25),
    inverseOnSurface = Color(0xFF9FD0D6),
    inversePrimary = Color(0xFFF2A176),

    scrim = Color(0xFF000000),
)
