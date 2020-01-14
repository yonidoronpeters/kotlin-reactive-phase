package com.odyssey.funny.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class FunnyConfiguration {
    @Bean
    fun webClient(): WebClient {
        return WebClient.create()
    }
}