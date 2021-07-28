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

    @GetMapping("/{contact-party}")
    fun getSingleContact(@PathVariable("contact-party") politicalParty: String): List<ResumeDataModel> {
        return service.getAllByPoliticalParty(politicalParty)
    }

    @PostMapping
    fun saveContact(@RequestBody data: ResumeDataModel) {
        service.post(data)
    }

//
}