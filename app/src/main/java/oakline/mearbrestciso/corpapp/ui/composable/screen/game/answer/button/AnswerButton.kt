package oakline.mearbrestciso.corpapp.ui.composable.screen.game.answer.button

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import oakline.mearbrestciso.corpapp.ui.composable.screen.game.answer.AnswerButtonItem
import oakline.mearbrestciso.corpapp.ui.composable.screen.game.answer.AnswerState
import oakline.mearbrestciso.corpapp.ui.composable.screen.shared.modifier.press.pressFeedback
import oakline.mearbrestciso.corpapp.ui.theme.LocalDimens

private val Height = 56.dp
private val BorderWidth = 2.dp

/** The fill never changes — only the border and text color react to the answer's state. */
@Composable
fun AnswerButton(
    item: AnswerButtonItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current
    val shape = RoundedCornerShape(dimens.controlCornerRadius)
    val interactionSource = remember { MutableInteractionSource() }

    val accentColor = when (item.state) {
        AnswerState.Correct -> MaterialTheme.colorScheme.primary
        AnswerState.Wrong -> MaterialTheme.colorScheme.error
        AnswerState.Neutral -> MaterialTheme.colorScheme.outlineVariant
    }
    val contentColor = when (item.state) {
        AnswerState.Correct -> MaterialTheme.colorScheme.primary
        AnswerState.Wrong -> MaterialTheme.colorScheme.error
        AnswerState.Neutral -> MaterialTheme.colorScheme.onSurface
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(Height)
            .pressFeedback(interactionSource)
            .clip(shape)
            .background(color = MaterialTheme.colorScheme.surface, shape = shape)
            .border(width = BorderWidth, color = accentColor, shape = shape)
            .clickable(
                interactionSource = interactionSource,
                indication = LocalIndication.current,
                onClick = onClick,
            )
            .padding(horizontal = dimens.cardPadding),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = item.text,
            color = contentColor,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
        )
    }
}
