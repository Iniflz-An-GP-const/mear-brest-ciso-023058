package oakline.mearbrestciso.corpapp.ui.composable.screen.game_over.player

data class PlayerScoreItem(
    val playerNumber: Int,
    val correctAnswers: Int,
    val totalQuestions: Int,
    val isWinner: Boolean,
)
