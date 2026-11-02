package oakline.mearbrestciso.corpapp.ui.composable.screen.main_menu.content.buttons.play_mode

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import oakline.mearbrestciso.corpapp.ui.composable.screen.shared.button.ActionButtonItem
import oakline.mearbrestciso.corpapp.ui.composable.screen.shared.button.ActionButton
import oakline.mearbrestciso.corpapp.ui.theme.LocalDimens

@Composable
fun PlayModeButtons(
    soloItem: ActionButtonItem,
    duoItem: ActionButtonItem,
    onSoloClick: () -> Unit,
    onDuoClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(dimens.itemSpacing),
    ) {
        ActionButton(item = soloItem, onClick = onSoloClick)
        ActionButton(item = duoItem, onClick = onDuoClick)
    }
}
