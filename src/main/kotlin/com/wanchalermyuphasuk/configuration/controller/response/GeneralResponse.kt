package com.wanchalermyuphasuk.configuration.controller.response

import com.fasterxml.jackson.annotation.JsonProperty

import java.io.Serializable

class GeneralResponse<T> : Serializable {

    @JsonProperty("code")
    var code: String? = null

    @JsonProperty("data")
    var data: T? = null
}
