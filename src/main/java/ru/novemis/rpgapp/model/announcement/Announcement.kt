package ru.novemis.rpgapp.model.announcement

import org.hibernate.annotations.GenericGenerator
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Announcement(
        @Id
        @GeneratedValue(generator="system-uuid")
        @GenericGenerator(name="system-uuid", strategy = "uuid")
        var id: String? = null,
        val title: String? = null,
        val gameType: GameType? = null,
        val sex: Sex? = null,
        val minAge: Int? = null,
        val maxAge: Int? = null,
        val description: String? = null,
        val anonymous: Boolean? = null,
        val commentsEnabled: Boolean? = null
)