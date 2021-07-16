package com.andoriii.civil.controller

import com.andoriii.civil.domain.SenadorDataModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/contact")
class ContactController {

    @GetMapping
    fun getContact(): SenadorDataModel {
        return SenadorDataModel.build("Cid Gomes", "27/04/1963")
    }
}