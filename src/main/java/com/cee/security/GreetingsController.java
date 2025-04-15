package com.cee.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("hello")
    public String hello() {
        return "Hello, World!";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("user")
    public String userEndpoint() {
        return "Hello, User!";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("admin")
    public String adminEndpoint() {
        return "Hello, Admin!";
    }
}
