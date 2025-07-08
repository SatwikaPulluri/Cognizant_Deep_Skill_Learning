package com.cognizant.jwt.controller;

import com.cognizant.jwt.model.AuthResponse;
import com.cognizant.jwt.security.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @RequestMapping("/authenticate")
    public ResponseEntity<AuthResponse> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(decodedBytes);
            String[] userDetails = credentials.split(":", 2);

            if ("user".equals(userDetails[0]) && "pwd".equals(userDetails[1])) {
                String token = jwtUtil.generateToken(userDetails[0]);
                return ResponseEntity.ok(new AuthResponse(token));
            }
        }

        return ResponseEntity.status(401).build();
    }
}
