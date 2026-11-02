package oakline.mearbrestciso.corpapp.di

import androidx.room.Room
import oakline.mearbrestciso.corpapp.data.database.OEEOPDatabase
import org.koin.dsl.module
import oakline.mearbrestciso.corpapp.data.repository.HighScoreRepository
import oakline.mearbrestciso.corpapp.data.repository.TopicRepository

private const val DB_NAME = "oeeop_quiz_db"

val dataModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = OEEOPDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<OEEOPDatabase>().highScoreDao() }

    single {
        HighScoreRepository(
            highScoreDao = get(),
            coroutineDispatcher = get(DispatchersQualifiers.IO)
        )
    }

    single { TopicRepository() }
}