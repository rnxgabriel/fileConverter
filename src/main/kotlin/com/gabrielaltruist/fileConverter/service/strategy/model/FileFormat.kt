package com.gabrielaltruist.fileConverter.service.strategy.model

enum class FileFormat(val extension: String, val contentType: String) {
    CSV("csv", "text/csv"),
    JSON("json", "application/json"),
    EXCEL("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    companion object {
        fun fromString(format: String): FileFormat {
            return entries.find { it.name.equals(format, ignoreCase = true) }
                ?: throw IllegalArgumentException("Formato Desconhecido: $format")
        }
    }
}