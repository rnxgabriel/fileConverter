package com.gabrielaltruist.fileConverter.service.strategy.writer

import com.gabrielaltruist.fileConverter.service.strategy.reader.GenericData

interface FileWriterStrategy {
    fun writeData(data: GenericData): ByteArray
}