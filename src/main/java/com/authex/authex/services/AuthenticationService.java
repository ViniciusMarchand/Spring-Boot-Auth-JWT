package com.authex.authex.services;

import org.springframework.stereotype.Service;

    
@Service
public class AuthenticationService {

    public String authenticate() {
        return "token";
    }
}
