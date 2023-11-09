package com.tp.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.tp.springboot.Application.user;

@RestController
@RequestMapping("services")
public class Controller {
    @GetMapping("/hello") // http://localhost:8080/services/hello
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(user.getUser());
    }
}
