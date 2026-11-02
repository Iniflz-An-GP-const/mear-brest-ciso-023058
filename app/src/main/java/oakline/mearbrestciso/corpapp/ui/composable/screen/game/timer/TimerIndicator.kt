package oakline.mearbrestciso.corpapp.ui.composable.screen.game.timer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import oakline.mearbrestciso.corpapp.ui.composable.screen.game.timer.TimerIndicatorItem

private val TrackHeight = 6.dp

/** A single-color bar that just drains — the simplest possible read. */
@Composable
fun TimerIndicator(
    item: TimerIndicatorItem,
    modifier: Modifier = Modifier,
) {
    LinearProgressIndicator(
        progress = { item.progress },
        modifier = modifier
            .fillMaxWidth()
            .height(TrackHeight)
            .clip(RoundedCornerShape(TrackHeight / 2)),
        color = MaterialTheme.colorScheme.primary,
        trackColor = MaterialTheme.colorScheme.outlineVariant,
    )
}
