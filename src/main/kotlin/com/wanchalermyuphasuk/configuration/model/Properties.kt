package com.wanchalermyuphasuk.configuration.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "properties")
class Properties {

    @Id
    @GeneratedValue
    var id: Int? = null

    @Column(name = "application")
    var application: String? = null

    @Column(name = "profile")
    var profile: String? = null

    @Column(name = "key")
    var key: String? = null

    @Column(name = "value")
    var value: String? = null
}

