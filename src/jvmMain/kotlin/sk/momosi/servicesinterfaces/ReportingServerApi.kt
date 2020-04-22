package sk.momosi.servicesinterfaces

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody
import sk.momosi.dto.employee.EmployeeDTO
import sk.momosi.services.Constants.MEDIA_JSON
import sk.momosi.services.Constants.MEDIA_PDF
import sk.momosi.services.Constants.REPORTING_SERVER
import javax.servlet.http.HttpServletResponse

@RequestMapping(value = [REPORTING_SERVER], produces = [MEDIA_JSON])
interface ReportingServerApi {

    @GetMapping("/employees")
    fun getEmployees(): ResponseEntity<List<EmployeeDTO>>

    @GetMapping("/employees/{id}")
    fun getEmployee(@PathVariable id: Long): ResponseEntity<EmployeeDTO>

    @PostMapping("/employees")
    fun addEmployee(@RequestBody employee: String): ResponseEntity<Any>

    @GetMapping("/report", produces = [MEDIA_PDF])
    fun getReport(response: HttpServletResponse): StreamingResponseBody

}
