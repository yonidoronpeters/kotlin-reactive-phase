package com.odyssey.funny.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.net.URI

@RestController
class PhraseController(private val restTemplate: RestTemplate,
                       @Value("\${funny.external.api.url}")
                       private val funnyApi: String) {

    @GetMapping("/")
    fun funnyPhrase(): ResponseEntity<String> {
        return restTemplate.getForEntity(URI.create(funnyApi), String::class.java)
    }
}