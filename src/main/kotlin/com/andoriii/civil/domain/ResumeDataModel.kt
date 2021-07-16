package com.andoriii.civil.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("SENADOR")
data class SenadorDataModel(
    @Id val id: String?,
    val name: String,
    val birthdate: String,
    val politicalParty: String?,
    val localBirth: String?,
    val address: String?,
    val telephone: String?,
    val email: String?
) {
    companion object {
        fun build(
            name: String,
            birthdate: String,
            id: String? = null,
            politicalParty: String? = null,
            localBirth: String? = null,
            address: String? = null,
            telephone: String? = null,
            email: String? = null
        ): SenadorDataModel {
            return SenadorDataModel(
                id = id,
                name = name,
                birthdate = birthdate,
                politicalParty = politicalParty,
                localBirth = localBirth,
                address = address,
                telephone = telephone,
                email = email
            )
        }
    }
}
