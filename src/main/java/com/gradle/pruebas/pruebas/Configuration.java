package com.gradle.pruebas.pruebas;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class Configuration {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }


}
