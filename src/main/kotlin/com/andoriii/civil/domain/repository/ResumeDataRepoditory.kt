package com.andoriii.civil.domain.repository

import com.andoriii.civil.domain.ResumeDataModel
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ResumeDataRepoditory : CrudRepository<ResumeDataModel, String> {

    @Query("select * from resumes")
    fun findResumes(): List<ResumeDataModel>
}