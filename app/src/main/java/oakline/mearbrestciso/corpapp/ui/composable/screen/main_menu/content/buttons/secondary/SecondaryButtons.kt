package oakline.mearbrestciso.corpapp.ui.composable.screen.main_menu.content.buttons.secondary

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import oakline.mearbrestciso.corpapp.ui.composable.screen.shared.button.ActionButtonItem
import oakline.mearbrestciso.corpapp.ui.composable.screen.shared.button.ActionButton
import oakline.mearbrestciso.corpapp.ui.theme.LocalDimens

@Composable
fun SecondaryButtons(
    highScoresItem: ActionButtonItem,
    aboutItem: ActionButtonItem,
    onHighScoresClick: () -> Unit,
    onAboutClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(dimens.itemSpacing),
    ) {
        ActionButton(
            item = highScoresItem,
            onClick = onHighScoresClick,
            modifier = Modifier.weight(1f),
        )
        ActionButton(
            item = aboutItem,
            onClick = onAboutClick,
            modifier = Modifier.weight(1f),
        )
    }
}
