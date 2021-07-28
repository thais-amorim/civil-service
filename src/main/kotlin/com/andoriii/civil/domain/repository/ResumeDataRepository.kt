package com.andoriii.civil.domain.repository

import com.andoriii.civil.domain.ResumeDataModel
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ResumeDataRepository : CrudRepository<ResumeDataModel, String> {

    @Query("SELECT * FROM resumes")
    fun findResumes(): List<ResumeDataModel>

    @Query("SELECT r FROM resumes r WHERE name = ?1")
    fun findSingleResume(name: String): ResumeDataModel

    @Query("SELECT r FROM resumes r WHERE political_party = ?1")
    fun getAllByParty(name: String): List<ResumeDataModel>
}