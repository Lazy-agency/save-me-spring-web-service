package io.space.spring.saveme.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<List<String>> getValues(){
        return new ResponseEntity<>(List.of("Test Value 1", "Test Value 2", "Test Value 3"), HttpStatus.OK);
    }

}
