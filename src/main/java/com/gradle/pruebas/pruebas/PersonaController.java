package com.gradle.pruebas.pruebas;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController(value = "/persona")
@Log4j
public class PersonaController {

    @GetMapping()
    public List<String> getPersonas() {
        return Arrays.asList("Luis", "Juan", "Pedro","juana");
    }
}
