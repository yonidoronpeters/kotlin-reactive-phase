package com.odyssey.funny.controller

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody


@RestController
class PhraseController(private val webClient: WebClient,
                       @Value("\${funny.external.api.url}")
                       private val funnyApi: String) {

    @GetMapping("/api")
    // non-reactive impl
    suspend fun funnyPhrase(): String {
        return externalRequest()
    }

    @GetMapping("/")
    suspend fun reactiveFunnyPhrase(): Flow<String> = flow {
        while (true) {
            emit(externalRequest())
            delay(1000)
        }
    }

    private suspend fun externalRequest() : String {
        return webClient.get()
                .uri(funnyApi)
                .accept(APPLICATION_JSON)
                .retrieve()
                // return when available
                .awaitBody()
    }
}