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
    @Column("birth_city") val localBirth: String?,
    val state: String?,
    val address: String?,
    val telephone: String?,
    val email: String?
) {
    companion object {
        fun build(
            name: String,
            birthDate: String,
            id: String? = null,
            politicalParty: String? = null,
            localBirth: String? = null,
            state: String? = null,
            address: String? = null,
            telephone: String? = null,
            email: String? = null
        ): ResumeDataModel {
            return ResumeDataModel(
                id = id,
                name = name,
                birthDate = birthDate,
                politicalParty = politicalParty,
                localBirth = localBirth,
                state = state,
                address = address,
                telephone = telephone,
                email = email
            )
        }
    }
}
