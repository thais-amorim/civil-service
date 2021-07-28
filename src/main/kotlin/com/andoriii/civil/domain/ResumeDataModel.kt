package com.andoriii.civil.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("resumes")
data class ResumeDataModel(
    @Id val id: String?,
    val name: String,
    @Column("birth_date") val birthDate: String?,
    @Column("political_party") val politicalParty: String?,
    @Column("local_birth") val localBirth: String?,
    val address: String?,
    val telephone: String?,
    val email: String?
) {
    companion object {
        fun build(
            name: String,
            birthdate: String,
            id: String? = null,
            politicalparty: String? = null,
            localbirth: String? = null,
            address: String? = null,
            telephone: String? = null,
            email: String? = null
        ): ResumeDataModel {
            return ResumeDataModel(
                id = id,
                name = name,
                birthDate = birthdate,
                politicalParty = politicalparty,
                localBirth = localbirth,
                address = address,
                telephone = telephone,
                email = email
            )
        }
    }
}
