package com.anonima.authServer.controllers;


import com.anonima.authServer.utils.RandomUserGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/auth")
public class AuthenticationController {

    public final RandomUserGeneratorService randomUserGenerator;
    @Autowired
    public AuthenticationController(RandomUserGeneratorService randUserGenerator) {
        this.randomUserGenerator = randUserGenerator;
    }

    @GetMapping("/log")
    public ResponseEntity<String> register(){
        String res = randomUserGenerator.generateRandomUserName();
        return (ResponseEntity<String>) ResponseEntity.ok(res);
    }

    @PostMapping("/log")
    public ResponseEntity<String> registerPost(){
        String res = randomUserGenerator.generateRandomUserName();
        return (ResponseEntity<String>) ResponseEntity.ok(res);
    }

    @PutMapping("/log")
    public ResponseEntity<String> registerPost4(){
        String res = randomUserGenerator.generateRandomUserName();
        return (ResponseEntity<String>) ResponseEntity.ok(res);
    }
}
