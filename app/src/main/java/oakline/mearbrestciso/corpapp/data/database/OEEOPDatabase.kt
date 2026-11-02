package oakline.mearbrestciso.corpapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import oakline.mearbrestciso.corpapp.data.database.dao.HighScoreDao
import oakline.mearbrestciso.corpapp.data.database.converter.Converters
import oakline.mearbrestciso.corpapp.data.entity.HighScore

@Database(
    entities = [HighScore::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class OEEOPDatabase : RoomDatabase() {

    abstract fun highScoreDao(): HighScoreDao
}

