package ru.geekbrains.preexaml6.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class WebHostController {
    @GetMapping("/")
    public ResponseEntity<?> getHost(@RequestParam String name,  Map<String, Object> model){
        System.out.println("name = "+name);
        return new ResponseEntity<>( HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<?> postHost(@RequestBody Object model) {
        System.out.println(model);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}
