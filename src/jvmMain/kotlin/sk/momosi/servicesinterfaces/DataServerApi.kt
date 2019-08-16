package sk.momosi.servicesinterfaces

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import sk.momosi.services.Constants.DATA_SERVER
import sk.momosi.services.Constants.PRODUCES_MEDIA_TYPE
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZonedDateTime

@RequestMapping(value = [DATA_SERVER], produces = [PRODUCES_MEDIA_TYPE])
interface DataServerApi {

    @GetMapping("/error")
    fun getCustomErrorMessage(): String?

    @GetMapping("/timestamp")
    fun getLongJvm(): Long

    @GetMapping("/date")
    fun getDateJvm(): LocalDate

    @GetMapping("/datetime")
    fun getDateTimeJvm(): LocalDateTime

    @GetMapping("/zoneddatetime")
    fun getZonedDateTimeJvm(): ZonedDateTime

    @GetMapping("/offsetdatetime")
    fun getOffsetDateTimeJvm(): OffsetDateTime

}
