package oakline.mearbrestciso.corpapp.ui.composable.screen.game.question

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import oakline.mearbrestciso.corpapp.ui.composable.screen.game.question.QuestionCardDefaults
import oakline.mearbrestciso.corpapp.ui.composable.screen.game.question.QuestionCardItem

private val StripeWidth = 6.dp

/** A solid accent stripe on the leading edge — text starts at the stripe, not centered. */
@Composable
fun QuestionCard(
    item: QuestionCardItem,
    modifier: Modifier = Modifier,
) {
    val shape = QuestionCardDefaults.shape

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .clip(shape)
            .background(color = MaterialTheme.colorScheme.surfaceVariant, shape = shape),
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(StripeWidth)
                .background(MaterialTheme.colorScheme.primary),
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .padding(QuestionCardDefaults.padding),
            contentAlignment = Alignment.CenterStart,
        ) {
            Text(
                text = item.text,
                style = QuestionCardDefaults.textStyle(),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}
