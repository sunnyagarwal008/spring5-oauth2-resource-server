package com.besseggen.resourceserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/whoami")
    @ResponseBody
    fun whoami(): String {
        return "test"
    }
}