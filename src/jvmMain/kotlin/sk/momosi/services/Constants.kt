package sk.momosi.services

import org.springframework.http.MediaType

object Constants {
    const val MEDIA_JSON = MediaType.APPLICATION_JSON_VALUE
    const val MEDIA_PDF = MediaType.APPLICATION_PDF_VALUE

    const val API_SERVER = "api-server"
    const val DATA_SERVER = "data-server"
    const val REPORTING_SERVER = "reporting-server"
}
