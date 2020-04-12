package sk.momosi.dto.data

import java.time.LocalDateTime
import javax.validation.constraints.NotNull

data class SensorValueCreateDTO (
    @get:NotNull val sensorId: Long?,
    @get:NotNull val sensorValue: Double?,
    var timestamp: LocalDateTime?
)
