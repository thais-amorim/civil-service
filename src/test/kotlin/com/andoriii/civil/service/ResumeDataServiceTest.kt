package com.andoriii.civil.service

import org.junit.Assert
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class ResumeDataServiceTest
@Autowired constructor(val service: ResumeDataService) {

//    @BeforeAll
//    fun setup() {
//        service.db.deleteAll()
//    }

    @Test
    fun getAllResumes() {
        val obtained = service.getAllResumes()
        println(obtained)
        Assert.assertEquals("java.util.ArrayList", obtained.javaClass.name)
    }

}