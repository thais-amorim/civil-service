package com.andoriii.civil.domain

data class SenadorDataModel(
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
            politicalParty: String? = null,
            localBirth: String? = null,
            address: String? = null,
            telephone: String? = null,
            email: String? = null
        ): SenadorDataModel {
            return SenadorDataModel(name, birthdate, politicalParty, localBirth, address, telephone, email)
        }
    }
}
