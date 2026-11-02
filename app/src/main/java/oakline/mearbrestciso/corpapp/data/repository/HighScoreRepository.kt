package oakline.mearbrestciso.corpapp.data.repository

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import oakline.mearbrestciso.corpapp.data.database.dao.HighScoreDao
import oakline.mearbrestciso.corpapp.data.entity.HighScore

class HighScoreRepository(
    private val highScoreDao: HighScoreDao,
    private val coroutineDispatcher: CoroutineDispatcher,
) {
    suspend fun save(score: HighScore) {
        return withContext(coroutineDispatcher) {
            highScoreDao.insert(score)
        }
    }

    suspend fun saveIfBetter(score: HighScore) {
        withContext(coroutineDispatcher) {
            highScoreDao.saveIfBetter(score)
        }
    }

    suspend fun getAll(): List<HighScore> {
        return withContext(coroutineDispatcher) {
            highScoreDao.getAll()
        }
    }

    suspend fun deleteAll() {
        withContext(coroutineDispatcher) {
            highScoreDao.deleteAll()
        }
    }
}