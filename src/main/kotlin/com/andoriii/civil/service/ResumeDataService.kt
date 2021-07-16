package com.andoriii.civil.service

import com.andoriii.civil.domain.ResumeDataModel
import com.andoriii.civil.domain.repository.ResumeDataRepoditory
import org.springframework.stereotype.Service

@Service
class ResumeDataService(val db: ResumeDataRepoditory) {

    fun finResumes(): List<ResumeDataModel> = db.findResumes()

    fun post(data: ResumeDataModel) = db.save(data)
}