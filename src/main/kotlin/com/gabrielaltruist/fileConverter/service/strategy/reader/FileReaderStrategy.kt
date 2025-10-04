package com.gabrielaltruist.fileConverter.service.strategy.reader

import java.io.InputStream

typealias GenericData = List<Map<String, Any>>

interface FileReaderStrategy {
    fun readFile(inputStream: InputStream): GenericData
}