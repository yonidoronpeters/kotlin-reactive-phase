package com.odyssey.funny.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
open class FunnyConfiguration {
    @Bean
    open fun restTemplate(): RestTemplate {
        return RestTemplate()
    }
}