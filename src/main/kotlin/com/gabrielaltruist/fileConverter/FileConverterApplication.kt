package com.gabrielaltruist.fileConverter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FileConverterApplication

fun main(args: Array<String>) {
	runApplication<FileConverterApplication>(*args)
}
