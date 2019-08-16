package sk.momosi.servicesinterfaces

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import sk.momosi.dto.employee.EmployeeDTO
import sk.momosi.services.Constants.EMPLOYEE_SERVER
import sk.momosi.services.Constants.PRODUCES_MEDIA_TYPE

@RequestMapping(value = [EMPLOYEE_SERVER], produces = [PRODUCES_MEDIA_TYPE])
interface EmployeeServerApi {

    @GetMapping("/employees")
    fun getEmployees(): ResponseEntity<List<EmployeeDTO>>

    @GetMapping("/employees/{id}")
    fun getEmployee(@PathVariable id: Long): ResponseEntity<EmployeeDTO>

    @PostMapping("/employees")
    fun addEmployee(@RequestBody employee: String): ResponseEntity<Any>

}
