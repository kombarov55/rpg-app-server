package ru.novemis.rpgapp.controller

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.novemis.rpgapp.model.announcement.Announcement

@RestController
@RequestMapping("/announcement")
class AnnouncementController(
        private val objectMapper: ObjectMapper
) {

    @PostMapping(consumes = ["application/json"])
    fun saveAnnouncement(@RequestBody announcement: Announcement) {
        println("debug")
    }

}