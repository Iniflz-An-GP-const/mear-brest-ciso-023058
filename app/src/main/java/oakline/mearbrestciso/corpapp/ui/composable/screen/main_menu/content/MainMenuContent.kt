package oakline.mearbrestciso.corpapp.ui.composable.screen.main_menu.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import oakline.mearbrestciso.corpapp.R
import oakline.mearbrestciso.corpapp.ui.composable.screen.main_menu.content.buttons.play_mode.PlayModeButtons
import oakline.mearbrestciso.corpapp.ui.composable.screen.main_menu.content.buttons.secondary.SecondaryButtons
import oakline.mearbrestciso.corpapp.ui.composable.screen.main_menu.content.header.MenuHeader
import oakline.mearbrestciso.corpapp.ui.composable.screen.shared.button.ActionButtonEmphasis
import oakline.mearbrestciso.corpapp.ui.composable.screen.shared.button.ActionButtonItem
import oakline.mearbrestciso.corpapp.ui.composable.screen.shared.button.ActionButton
import oakline.mearbrestciso.corpapp.ui.theme.LocalDimens

@Composable
fun MainMenuContent(
    modifier: Modifier = Modifier,
    onTopicsSelectionScreenNavigation: (isMultiplayer: Boolean) -> Unit,
    onHighScoresScreenNavigation: () -> Unit,
    onAboutScreenNavigation: () -> Unit,
    onExit: () -> Unit,
) {
    val dimens = LocalDimens.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(dimens.screenPadding),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        MenuHeader(modifier = Modifier.padding(bottom = dimens.sectionGap))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(dimens.itemSpacing),
        ) {
            PlayModeButtons(
                soloItem = ActionButtonItem(
                    text = stringResource(R.string.main_menu_play_solo),
                    icon = Icons.Filled.PlayArrow,
                ),
                duoItem = ActionButtonItem(
                    text = stringResource(R.string.main_menu_play_multiplayer),
                    icon = Icons.Filled.Groups,
                ),
                onSoloClick = { onTopicsSelectionScreenNavigation(false) },
                onDuoClick = { onTopicsSelectionScreenNavigation(true) },
            )
            SecondaryButtons(
                highScoresItem = ActionButtonItem(
                    text = stringResource(R.string.main_menu_high_scores),
                    icon = Icons.Filled.EmojiEvents,
                ),
                aboutItem = ActionButtonItem(
                    text = stringResource(R.string.main_menu_about),
                    icon = Icons.Filled.Info,
                ),
                onHighScoresClick = onHighScoresScreenNavigation,
                onAboutClick = onAboutScreenNavigation,
            )
            ActionButton(
                item = ActionButtonItem(
                    text = stringResource(R.string.main_menu_exit),
                    icon = Icons.AutoMirrored.Filled.ExitToApp,
                    emphasis = ActionButtonEmphasis.Alternate,
                ),
                onClick = onExit,
            )
        }
    }
}
