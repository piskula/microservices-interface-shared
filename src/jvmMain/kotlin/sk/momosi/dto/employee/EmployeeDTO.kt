package sk.momosi.dto.employee

import java.time.LocalDate
import java.util.*

data class EmployeeDTO (
    val name: String,
    val date: LocalDate,
    val id: UUID
)
