package sk.momosi.servicesinterfaces

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import sk.momosi.dto.data.SensorDTO
import sk.momosi.dto.data.SensorValueCreateDTO
import sk.momosi.dto.data.SensorValueDTO
import sk.momosi.services.Constants.DATA_SERVER
import sk.momosi.services.Constants.PRODUCES_MEDIA_TYPE
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZonedDateTime
import javax.validation.Valid

@RequestMapping(value = [DATA_SERVER], produces = [PRODUCES_MEDIA_TYPE])
interface DataServerApi {

    // TEST endpoints

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

    // DATA endpoints

    @GetMapping("/lastvalueforsensor")
    fun getLastValueForSensor(@RequestParam sensor: Long): ResponseEntity<SensorValueDTO>

    @GetMapping("/sensors")
    fun getSensors(): Collection<SensorDTO>

    @PostMapping("/sensorvalue")
    fun postNewSensorValue(@Valid @RequestBody sensorValue: SensorValueCreateDTO): ResponseEntity<SensorValueDTO>

}
