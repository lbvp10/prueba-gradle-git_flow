package com.gradle.pruebas.pruebas;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Configuration {
    private ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
