package ru.novemis.rpgapp.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.*
import java.io.File

@RestController
@RequestMapping("/upload")
class FileUploadController(
        @Value("\${upload-dir}")
        private val uploadDir: String
) {

    @PostMapping(value = ["/{uploadUid}"], consumes = ["*/*;charset=UTF-8"])
    fun upload(@RequestBody body: String, @PathVariable("uploadUid") uploadUid: String) {
        val split = body.split("\r\n\r\n")
        val head = split[0]
        val content = split[1]

        val imageExtension = head.split("\r\n")[1].split(";")[2].split(".")[1].replace("\"", "")

        File("${uploadDir}/${uploadUid}.$imageExtension").writeBytes(content.toByteArray())
    }

}