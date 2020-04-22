package ru.novemis.rpgapp.model.announcement

data class Announcement(
        var id: String? = null,
        val title: String? = null,
        val gameType: GameType? = null,
        val sex: Sex? = null,
        val minAge: Int? = null,
        val maxAge: Int? = null,
        val description: String? = null,
        val anonymous: Boolean? = null,
        val commentsEnabled: Boolean? = null
) {
}