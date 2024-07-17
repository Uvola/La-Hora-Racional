package com.horaracional.La.Hora.Racional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.token.TokenService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public String autenticar(@RequestBody LoginForm form) {
        UsernamePasswordAuthenticationToken datosLogin = form.convertir();
        try {
            Authentication authentication = authManager.authenticate(datosLogin);
            String token = tokenService.generarToken(authentication.getName());
            return token;
        } catch (AuthenticationException e) {
            return "Error en el login: " + e.getMessage();
        }
    }
}