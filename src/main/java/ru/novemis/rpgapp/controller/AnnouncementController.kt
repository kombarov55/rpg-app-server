package ru.novemis.rpgapp.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.novemis.rpgapp.dao.AnnouncementRepository
import ru.novemis.rpgapp.model.announcement.Announcement

@RestController
@RequestMapping("/announcement")
class AnnouncementController(
        private val announcementRepository: AnnouncementRepository
) {

    @PostMapping(consumes = ["application/json"])
    fun saveAnnouncement(@RequestBody announcement: Announcement) {
        announcementRepository.save(announcement)
        println("debug")
    }

}