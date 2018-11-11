package com.wanchalermyuphasuk.configuration.controller

import com.wanchalermyuphasuk.configuration.controller.response.GetConfigurationResponse
import com.wanchalermyuphasuk.configuration.controller.response.PropertySourceResponse
import com.wanchalermyuphasuk.configuration.service.PropertiesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.HashMap


@RestController
class ConfigurationController: BaseController()  {

    @Autowired
    private lateinit var propertiesService: PropertiesService

    @GetMapping(value  = ["/{application}/{profile}"])
    fun getConfiguration(@PathVariable("application") application: String,
                         @PathVariable("profile") profile: String): ResponseEntity<*> {
        log.info("================ Start get configuration ========================")
        val profiles = mutableListOf<String>()
        profiles.add(profile)
        val propertiesEntityList = propertiesService.getProperties(application, profile)
        val configurationMap = HashMap<String, String>()
        propertiesEntityList.forEach {
            configurationMap[it.key!!] = it.value!!
        }
        val scopePropertySourceResponse = PropertySourceResponse(name = "$application.properties", source =  configurationMap)
        val propertySourceResponses = mutableListOf<PropertySourceResponse>()
        propertySourceResponses.add(scopePropertySourceResponse)
        val getConfigurationResponse = GetConfigurationResponse(name = application
                                                                , profiles = profiles
                                                                , propertySources = propertySourceResponses)
        log.info("========== End get configuration ========================")
        return ResponseEntity.ok(getConfigurationResponse)
    }
}