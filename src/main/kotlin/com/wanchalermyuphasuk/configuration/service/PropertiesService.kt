package com.wanchalermyuphasuk.configuration.service

import com.wanchalermyuphasuk.configuration.model.Properties
import com.wanchalermyuphasuk.configuration.repository.PropertiesRepository
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PropertiesService {
    private val logger = LogManager.getLogger(this.javaClass)

    @Autowired
    private val propertiesRepository: PropertiesRepository? = null

    fun getProperties(application: String, profile: String): MutableList<Properties> {
        logger.info("Get properties by [{}] application and [{}] profile", application, profile)
        val propertiesEntityList = propertiesRepository!!.findByApplicationAndProfile(application, profile)
        logger.info("End get properties")
        return propertiesEntityList
    }

}
