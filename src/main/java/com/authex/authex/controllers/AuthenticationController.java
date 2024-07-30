package com.authex.authex.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authex.authex.services.AuthenticationService;

@RestController
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("authenticate")
    public String authenticate() {
        return authenticationService.authenticate();
    }   
}