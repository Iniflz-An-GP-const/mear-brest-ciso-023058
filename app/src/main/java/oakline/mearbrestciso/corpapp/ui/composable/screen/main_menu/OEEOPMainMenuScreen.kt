package oakline.mearbrestciso.corpapp.ui.composable.screen.main_menu

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import oakline.mearbrestciso.corpapp.ui.composable.screen.main_menu.content.MainMenuContent

@Composable
fun OEEOPMainMenuScreen(
    modifier: Modifier = Modifier,
    onTopicsSelectionScreenNavigation: (isMultiplayer: Boolean) -> Unit,
    onHighScoresScreenNavigation: () -> Unit,
    onAboutScreenNavigation: () -> Unit,
    onExit: () -> Unit,
) {
    MainMenuContent(
        modifier = modifier,
        onTopicsSelectionScreenNavigation = onTopicsSelectionScreenNavigation,
        onHighScoresScreenNavigation = onHighScoresScreenNavigation,
        onAboutScreenNavigation = onAboutScreenNavigation,
        onExit = onExit,
    )
}
