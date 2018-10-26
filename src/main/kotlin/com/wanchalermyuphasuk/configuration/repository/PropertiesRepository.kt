package com.wanchalermyuphasuk.configuration.repository

import com.wanchalermyuphasuk.configuration.model.Properties
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PropertiesRepository : JpaRepository<Properties, Int> {
    fun findByApplicationAndProfile(application: String, profile: String): MutableList<Properties>
}
