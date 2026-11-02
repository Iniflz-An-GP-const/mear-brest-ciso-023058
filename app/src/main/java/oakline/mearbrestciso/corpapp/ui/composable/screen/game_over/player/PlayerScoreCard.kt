package oakline.mearbrestciso.corpapp.ui.composable.screen.game_over.player

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import oakline.mearbrestciso.corpapp.R
import oakline.mearbrestciso.corpapp.ui.composable.screen.game_over.player.PlayerScoreItem
import oakline.mearbrestciso.corpapp.ui.theme.LocalDimens

private val BorderWidth = 2.dp

/** The fill never changes — only the border and text color react to who won. */
@Composable
fun PlayerScoreCard(
    item: PlayerScoreItem,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current
    val shape = RoundedCornerShape(dimens.cardCornerRadius)

    val accentColor = if (item.isWinner) {
        MaterialTheme.colorScheme.primary
    } else {
        MaterialTheme.colorScheme.outlineVariant
    }
    val contentColor = if (item.isWinner) {
        MaterialTheme.colorScheme.primary
    } else {
        MaterialTheme.colorScheme.onSurface
    }

    Column(
        modifier = modifier
            .background(color = MaterialTheme.colorScheme.surface, shape = shape)
            .border(width = BorderWidth, color = accentColor, shape = shape)
            .padding(dimens.cardPadding),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(dimens.tightSpacing),
    ) {
        Text(
            text = stringResource(R.string.game_over_player_format, item.playerNumber),
            style = MaterialTheme.typography.labelLarge,
            color = contentColor,
        )
        Text(
            text = "${item.correctAnswers}/${item.totalQuestions}",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = contentColor,
        )
    }
}
