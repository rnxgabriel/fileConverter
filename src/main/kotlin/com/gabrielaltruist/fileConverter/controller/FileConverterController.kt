package com.gabrielaltruist.fileConverter.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/api/v1/converter")
class FileConverterController {

    @PostMapping
    fun fileUpload(
        @RequestParam("file") file: MultipartFile,
        @RequestParam("targetFormat") targetFormat: String
    ): ResponseEntity<ByteArray> {
        TODO()
    }
}