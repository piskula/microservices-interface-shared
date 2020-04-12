package sk.momosi.dto.data

import java.time.LocalDateTime

interface SensorValueDTO {
    val id: Long?
    val sensor: SensorDTO?
    val timestamp: LocalDateTime?
    val value: Double?
}
