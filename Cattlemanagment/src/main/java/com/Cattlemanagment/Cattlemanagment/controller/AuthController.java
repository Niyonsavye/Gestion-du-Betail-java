package com.Cattlemanagment.Cattlemanagment.controller;

import com.Cattlemanagment.Cattlemanagment.dto.AuthRequest;
import com.Cattlemanagment.Cattlemanagment.dto.AuthResponse;
import com.Cattlemanagment.Cattlemanagment.dto.RegisterRequest;
import com.Cattlemanagment.Cattlemanagment.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        AuthResponse response = authService.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        AuthResponse response = authService.authenticate(request);
        return ResponseEntity.ok(response);
    }
}
