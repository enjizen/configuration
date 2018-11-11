package com.wanchalermyuphasuk.configuration.controller

import org.apache.logging.log4j.LogManager

open class BaseController {
    val log = LogManager.getLogger(this.javaClass)!!
}