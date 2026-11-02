package oakline.mearbrestciso.corpapp.data.repository

import oakline.mearbrestciso.corpapp.data.model.Answer
import oakline.mearbrestciso.corpapp.data.model.Question
import oakline.mearbrestciso.corpapp.data.model.Topic

class TopicRepository {
    private val topics = listOf<Topic>(

    )

    fun getTopics(): List<Topic> = topics
}
