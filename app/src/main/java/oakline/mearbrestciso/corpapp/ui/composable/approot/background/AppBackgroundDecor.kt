package oakline.mearbrestciso.corpapp.ui.composable.approot.background

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import oakline.mearbrestciso.corpapp.ui.composable.approot.background.PlacedIcon
import oakline.mearbrestciso.corpapp.ui.composable.approot.background.placeBackgroundIcons
import oakline.mearbrestciso.corpapp.ui.composable.approot.background.points.BackgroundAnchors
import kotlin.random.Random

private data class DriftTiming(
    val swayRange: Dp,
    val swayDurationMs: Int,
    val fadeDurationMs: Int,
    val fadeDelayMs: Int,
)

@Composable
fun AppBackgroundDecor(modifier: Modifier = Modifier) {
    val items = remember {
        val random = Random(System.nanoTime())
        placeBackgroundIcons(random, BackgroundAnchors).map { item ->
            item to DriftTiming(
                swayRange = (8 + random.nextInt(10)).dp,
                swayDurationMs = 3000 + random.nextInt(2500),
                fadeDurationMs = 2500 + random.nextInt(2000),
                fadeDelayMs = random.nextInt(2000),
            )
        }
    }

    Box(modifier = modifier) {
        items.forEach { (item, timing) -> DriftDecorIcon(item, timing) }
    }
}

@Composable
private fun BoxScope.DriftDecorIcon(item: PlacedIcon, timing: DriftTiming) {
    val transition = rememberInfiniteTransition(label = "menuBackgroundDrift")

    val sway by transition.animateFloat(
        initialValue = -1f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = timing.swayDurationMs, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "sway",
    )

    val fade by transition.animateFloat(
        initialValue = 0.3f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = timing.fadeDurationMs,
                delayMillis = timing.fadeDelayMs,
                easing = LinearEasing,
            ),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "fade",
    )

    Icon(
        imageVector = item.icon,
        contentDescription = null,
        tint = MaterialTheme.colorScheme.onBackground,
        modifier = Modifier
            .align(item.anchor)
            .size(item.size)
            .graphicsLayer {
                translationX = sway * timing.swayRange.toPx()
                alpha = item.baseAlpha * fade
            },
    )
}
