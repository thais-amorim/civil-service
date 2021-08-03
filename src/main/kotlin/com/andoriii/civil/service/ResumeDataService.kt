package com.andoriii.civil.service

import com.andoriii.civil.domain.ResumeDataModel
import com.andoriii.civil.domain.repository.ResumeDataRepository
import org.springframework.stereotype.Service

@Service
class ResumeDataService(val db: ResumeDataRepository) {

    fun getAllResumes(): List<ResumeDataModel> = db.findResumes()

    fun getSingleResume(name: String) = db.findSingleResume(name)

    fun getAllByPoliticalParty(name: String) = db.getAllByParty(name)

    fun getAllByState(name: String) = db.getAllByState(name)

    fun post(data: ResumeDataModel) = db.save(data)
}