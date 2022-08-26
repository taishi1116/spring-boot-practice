package com.example.practice.presentation

import com.example.practice.domain.Demo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class DemoController {

    @GetMapping("demo")
    fun getDemo(@RequestParam("name") name:String): Demo {
        return Demo(name = name)
    }
}



