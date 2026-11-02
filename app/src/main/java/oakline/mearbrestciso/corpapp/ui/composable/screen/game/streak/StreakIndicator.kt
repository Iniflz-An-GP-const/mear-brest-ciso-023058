package oakline.mearbrestciso.corpapp.ui.composable.screen.game.streak

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Whatshot
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import oakline.mearbrestciso.corpapp.R
import oakline.mearbrestciso.corpapp.ui.composable.screen.game.streak.StreakItem
import oakline.mearbrestciso.corpapp.ui.theme.LocalDimens

private val IconSize = 18.dp

/** A warm pill with a flame icon — the classic "hot streak" look. */
@Composable
fun StreakIndicator(
    item: StreakItem,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(dimens.controlCornerRadius),
        color = MaterialTheme.colorScheme.tertiaryContainer,
    ) {
        Row(
            modifier = Modifier.padding(
                horizontal = dimens.itemSpacing,
                vertical = dimens.tightSpacing,
            ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(dimens.tightSpacing),
        ) {
            Icon(
                imageVector = Icons.Filled.Whatshot,
                contentDescription = stringResource(R.string.streak_count_description_format, item.count),
                tint = MaterialTheme.colorScheme.onTertiaryContainer,
                modifier = Modifier.size(IconSize),
            )
            Text(
                text = item.count.toString(),
                color = MaterialTheme.colorScheme.onTertiaryContainer,
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
