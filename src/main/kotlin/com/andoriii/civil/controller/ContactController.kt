package com.andoriii.civil.controller

import com.andoriii.civil.domain.ResumeDataModel
import com.andoriii.civil.service.ResumeDataService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/contact")
class ContactController(val service: ResumeDataService) {

    @GetMapping
    fun getAllContacts(): List<ResumeDataModel> {
        return service.getAllResumes()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): ResumeDataModel {
        return service.getResumeById(id)
    }

    @GetMapping(params = ["party"])
    fun getResumesByParty(@RequestParam party: String): List<ResumeDataModel> {
        return service.getAllByPoliticalParty(party)
    }

    @GetMapping(params = ["state"])
    fun getResumesByState(@RequestParam state: String): List<ResumeDataModel> {
        return service.getAllByState(state)
    }

    @PostMapping
    fun saveContact(@RequestBody data: ResumeDataModel) {
        service.post(data)
    }

}