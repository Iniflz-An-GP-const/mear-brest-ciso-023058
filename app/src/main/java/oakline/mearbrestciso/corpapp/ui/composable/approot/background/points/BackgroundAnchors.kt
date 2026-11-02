package oakline.mearbrestciso.corpapp.ui.composable.approot.background.points

import androidx.compose.ui.BiasAlignment

/** A ring of icons around the centered content, evenly spaced at a fixed radius. */
val BackgroundAnchors: List<BiasAlignment> = listOf(
    BiasAlignment(0.85f, 0.23f),
    BiasAlignment(0.62f, 0.62f),
    BiasAlignment(0.23f, 0.85f),
    BiasAlignment(-0.23f, 0.85f),
    BiasAlignment(-0.62f, 0.62f),
    BiasAlignment(-0.85f, 0.23f),
    BiasAlignment(-0.85f, -0.23f),
    BiasAlignment(-0.62f, -0.62f),
    BiasAlignment(-0.23f, -0.85f),
    BiasAlignment(0.23f, -0.85f),
    BiasAlignment(0.62f, -0.62f),
    BiasAlignment(0.85f, -0.23f),
)
