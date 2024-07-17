package com.horaracional.La.Hora.Racional.controller;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {

    private String email;
    private String password;

    // Getters and setters

    public UsernamePasswordAuthenticationToken convertir() {
        return new UsernamePasswordAuthenticationToken(email, password);
    }
}
