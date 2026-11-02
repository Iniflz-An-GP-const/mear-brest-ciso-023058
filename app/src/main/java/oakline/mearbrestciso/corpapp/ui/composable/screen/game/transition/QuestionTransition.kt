package oakline.mearbrestciso.corpapp.ui.composable.screen.game.transition

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import oakline.mearbrestciso.corpapp.ui.composable.screen.game.transition.QuestionTransitionDefaults

private const val OUTGOING_SCALE = 0.9f
private const val INCOMING_SCALE = 1.1f

/**
 * The answered question shrinks and fades away into the distance, then the next one
 * settles in from slightly larger — like stepping forward to the next card.
 */
@Composable
fun QuestionTransition(
    questionIndex: Int,
    modifier: Modifier = Modifier,
    content: @Composable (questionIndex: Int) -> Unit,
) {
    val halfDurationMs = QuestionTransitionDefaults.DURATION_MS / 2

    AnimatedContent(
        targetState = questionIndex,
        transitionSpec = {
            val enterSpec = tween<Float>(durationMillis = halfDurationMs, delayMillis = halfDurationMs)
            val exitSpec = tween<Float>(durationMillis = halfDurationMs)

            (scaleIn(enterSpec, initialScale = INCOMING_SCALE) + fadeIn(enterSpec))
                .togetherWith(scaleOut(exitSpec, targetScale = OUTGOING_SCALE) + fadeOut(exitSpec))
        },
        label = "QuestionTransition",
        modifier = modifier,
    ) { index ->
        content(index)
    }
}
