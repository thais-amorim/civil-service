package com.andoriii.civil.domain.repository

import com.andoriii.civil.domain.ResumeDataModel
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface ResumeDataRepository : CrudRepository<ResumeDataModel, String> {

    @Query("SELECT * FROM resumes")
    fun findResumes(): List<ResumeDataModel>

    @Query("SELECT r FROM resumes r WHERE r.name = :name")
    fun findSingleResume(@Param("name") name: String): ResumeDataModel

    @Query("SELECT * FROM resumes r WHERE r.political_party = :name")
    fun getAllByParty(@Param("name") name: String): List<ResumeDataModel>

    @Query("SELECT * FROM resumes r WHERE r.state = :state")
    fun getAllByState(@Param("state") state: String): List<ResumeDataModel>
}