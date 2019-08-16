package sk.momosi.servicesinterfaces

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import sk.momosi.services.Constants.API_SERVER
import java.time.LocalDateTime

/*
 * This now acts as a gate for DataServer.
 */
@RequestMapping(API_SERVER)
interface ApiServerApi {

    @GetMapping("/testconfig")
    fun getTestConfig(): String?

    @GetMapping("/date")
    fun getDate(): LocalDateTime

    @GetMapping("/timestamp")
    fun getTimestamp(): Long

}
