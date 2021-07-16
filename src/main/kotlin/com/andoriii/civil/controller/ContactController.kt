package com.andoriii.civil.controller

import com.andoriii.civil.domain.ResumeDataModel
import com.andoriii.civil.service.ResumeDataService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/contact")
class ContactController(val service: ResumeDataService) {

    @GetMapping
    fun getContact(): ResumeDataModel {
        return ResumeDataModel.build("Cid Gomes", "27/04/1963")
    }

    @PostMapping
    fun saveContact(@RequestBody data: ResumeDataModel) {
        service.post(data)
    }
}