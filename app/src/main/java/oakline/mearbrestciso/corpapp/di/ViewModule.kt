package oakline.mearbrestciso.corpapp.di

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import oakline.mearbrestciso.corpapp.ui.viewmodel.GameViewModel
import oakline.mearbrestciso.corpapp.ui.viewmodel.HighScoreViewModel
import oakline.mearbrestciso.corpapp.ui.viewmodel.TopicsSelectionViewModel

val viewModule = module {
    viewModel {
        TopicsSelectionViewModel(topicRepository = get())
    }

    viewModel {
        GameViewModel(
            savedStateHandle = get(),
            topicRepository = get(),
            highScoreRepository = get()
        )
    }

    viewModel {
        HighScoreViewModel(
            highScoreRepository = get()
        )
    }
}