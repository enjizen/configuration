package com.wanchalermyuphasuk.configuration.controller.response

import com.fasterxml.jackson.annotation.JsonProperty

data class GetConfigurationResponse (
    @JsonProperty(value = "name")
    var name: String? = null,

    @JsonProperty(value = "profiles")
    var profiles: MutableList<String>? = null,

    @JsonProperty(value = "propertySources")
    var propertySources: MutableList<PropertySourceResponse>? = null
)
